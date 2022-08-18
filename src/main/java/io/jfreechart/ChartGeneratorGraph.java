package io.jfreechart;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class ChartGeneratorGraph {

    private static final String TITLE = "Activities Graph";
    private static ChartPanel chartPanel;

    public ChartGeneratorGraph(JTable taskTable) {
        
        chartPanel = createChart(taskTable);
        
        JFrame frame = new JFrame(TITLE);
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLayout(new BorderLayout(0, 5));
        frame.add(chartPanel, BorderLayout.CENTER);
        
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setHorizontalAxisTrace(true);
        chartPanel.setVerticalAxisTrace(true);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        panel.add(createDate());
        panel.add(createZoom());
        panel.add(saveImage());
        
        frame.add(panel, BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
  
    }

    private JComboBox createDate() {
        
        final JComboBox date = new JComboBox();
        final String[] dateCmds = { "Horizontal Dates", "Vertical Dates" };
        
        date.setModel(new DefaultComboBoxModel(dateCmds));
        date.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFreeChart chart = chartPanel.getChart();
                XYPlot plot = (XYPlot) chart.getPlot();
                DateAxis domain = (DateAxis) plot.getDomainAxis();
                if (dateCmds[0].equals(date.getSelectedItem())) {
                    domain.setVerticalTickLabels(false);
                } else {
                    domain.setVerticalTickLabels(true);
                }
            }
        });
        return date;
        
    }

    private JButton createZoom() {
        
        final JButton auto = new JButton(new AbstractAction("Auto Zoom") {

            @Override
            public void actionPerformed(ActionEvent e) {
                chartPanel.restoreAutoBounds();
            }
        });
        return auto;
        
    }

    private ChartPanel createChart(JTable taskTable) {
        
        XYDataset data = createDataset(taskTable);
        JFreeChart chart = ChartFactory.createTimeSeriesChart(TITLE, "Completed Activities", "Assigned Activities", data, true, true, false);
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
        renderer.setDefaultShapesVisible(true);
        
        return new ChartPanel(chart);
        
    }

    private XYDataset createDataset(JTable taskTable) {
        
        DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        
        int assignedTasks = taskTable.getRowCount();
        int completedTasks = 0;
        
        for (int i = assignedTasks - 1; i >= 0; i--) {
                String status = (String) model.getValueAt(i, 1);
                if ("completed".equalsIgnoreCase(status))
                        completedTasks++;
        }
        
        dataset.addSeries(createSeries(taskTable, "Assigned", assignedTasks));
        dataset.addSeries(createSeries(taskTable, "Completed", completedTasks));
        
        /*
        /***optional code***
        List<String> tasks = new ArrayList<>();
        for(int i = 0; i <= taskTable.getRowCount()-1; i++) {
            tasks.add(model.getValueAt(i, 0).toString());
        }
        
        for(int i = 0; i < tasks.size(); i++)
            dataset.addSeries(createSeries(taskTable, tasks.get(i), completedTasks));
        */
        return dataset;
        
    }

    private TimeSeries createSeries(JTable taskTable, String name, int scale) {
        TimeSeries series = new TimeSeries(name);

        int day = getDayForNow();
        int month = getMonthForNow();
        int year = getYearForNow();
        
        try {
            for (int i = 0; i < taskTable.getRowCount(); i++) {
                series.add(new Day(day + i, month + i, year), Math.pow(2, i) * scale);  
                /*
                /***optional code***
                series.add(new Day(day + i, month + i, year + i), Math.pow(2, i) * scale);  
                */
            }
        } catch (Exception e) {

        }
        return series;
    }
    
    private int getDayForNow() {
        int day = new java.util.Date().getDate();
        return day;
    }
    
    private int getMonthForNow() {
        int month = new java.util.Date().getMonth();
        return month+1;
    }
    
     private int getYearForNow() {
        int year = new java.util.Date().getYear();
        return year+1900;
    }
     
    private JButton saveImage() {

        final JButton auto = new JButton(new AbstractAction("Save Image") {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveImageInLocal(new Main().selectADestinationToSave());
            }
        });
        return auto;

    }

    public void saveImageInLocal(File file) {

        Rectangle rec = chartPanel.getBounds();
        BufferedImage img = new BufferedImage(rec.width, rec.height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = img.getGraphics();
        chartPanel.paint(g);

        try {

            ImageIO.write(img, "png", file);
            JOptionPane.showMessageDialog(null, "Image saved!", "", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {

        }
    }
    
}
