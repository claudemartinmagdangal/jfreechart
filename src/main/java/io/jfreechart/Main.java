package io.jfreechart;

import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Main extends javax.swing.JFrame {
   
    public Main() {
        initComponents();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskTextArea = new javax.swing.JTextArea();
        addBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        completeTaskBtn = new javax.swing.JButton();
        deleteTaskBtn = new javax.swing.JButton();
        taskLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        generateGraphBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        importBtn = new javax.swing.JButton();
        navLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tasks");
        setBounds(new java.awt.Rectangle(300, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        taskTextArea.setColumns(20);
        taskTextArea.setRows(5);
        jScrollPane1.setViewportView(taskTextArea);

        addBtn.setText("ADD");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task", "Status", "Assigned Date", "Completed Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        taskTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(taskTable);
        if (taskTable.getColumnModel().getColumnCount() > 0) {
            taskTable.getColumnModel().getColumn(1).setResizable(false);
            taskTable.getColumnModel().getColumn(2).setResizable(false);
            taskTable.getColumnModel().getColumn(3).setResizable(false);
        }

        completeTaskBtn.setText("COMPLETE");
        completeTaskBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                completeTaskBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                completeTaskBtnMouseExited(evt);
            }
        });
        completeTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeTaskBtnActionPerformed(evt);
            }
        });

        deleteTaskBtn.setText("DELETE");
        deleteTaskBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteTaskBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteTaskBtnMouseExited(evt);
            }
        });
        deleteTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTaskBtnActionPerformed(evt);
            }
        });

        taskLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        taskLabel.setText("TASK");

        saveBtn.setText("SAVE");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveBtnMouseExited(evt);
            }
        });
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        generateGraphBtn.setText("CHART");
        generateGraphBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generateGraphBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generateGraphBtnMouseExited(evt);
            }
        });
        generateGraphBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateGraphBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("CLEAR");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBtnMouseExited(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("EXIT");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        importBtn.setText("IMPORT");
        importBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                importBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                importBtnMouseExited(evt);
            }
        });
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });

        navLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        navLabel.setText("NAVIGATE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(completeTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(taskLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(importBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(generateGraphBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(navLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(taskLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(completeTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(navLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateGraphBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Tasks Window");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
              
        String taskArea = taskTextArea.getText();
        if (!taskArea.isEmpty() && !taskArea.isBlank()) {
            DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
            model.addRow(new Object[] { taskArea, "new", getDateNow(), "" });
        }
        taskTextArea.setText("");
            
    }//GEN-LAST:event_addBtnActionPerformed
   
    private String getDateNow() {
  
        return DateTimeFormatter.ofPattern("MM/dd/YYYY").format(LocalDateTime.now());
        /*
        /***optional code***
        return DateTimeFormatter.ofPattern("MM/dd/YYYY HH:mm:ss").format(LocalDateTime.now());
        */
        
    }
    
    private void completeTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeTaskBtnActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
        
        try {
            int[] statuses = taskTable.getSelectedRows();
            
            for (int s : statuses) {
                
                String status = (String) model.getValueAt(s, 1);
                
                if ("new".equalsIgnoreCase(status)) {
                    model.setValueAt("completed", s, 1);
                    model.setValueAt(getDateNow(), s, 3);
                }
            }
        } catch (Exception e) {

        }
        
    }//GEN-LAST:event_completeTaskBtnActionPerformed

    private void deleteTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTaskBtnActionPerformed
       
        DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
        
        int count = taskTable.getSelectedRowCount();
        int[] selectedRows = taskTable.getSelectedRows();
        
        try {
            for (int i = count - 1; i >= 0; i--) {
                model.removeRow(selectedRows[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        
    }//GEN-LAST:event_deleteTaskBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        boolean isFileSaved = saveExcelFile(taskTable);
        
        if(isFileSaved)
            JOptionPane.showMessageDialog(this, "Successfully saved", "", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_saveBtnActionPerformed

    public boolean saveExcelFile(JTable table) {
        
        boolean status = false;
        File path = null;
        
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Choose a destination to save");
            
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                path = fileToSave.getAbsoluteFile();
            
            
            TableModel model = table.getModel();
                WritableWorkbook wb = null;
                if(path.getName().endsWith(".xls")) {
                    wb = Workbook.createWorkbook(new File(path.toString()));
                } else {
                    wb = Workbook.createWorkbook(new File(path.toString()+".xls"));
                }
                WritableSheet sheet = wb.createSheet("Tasks", 0);
                WritableCellFormat headerFormat  = new WritableCellFormat();
                WritableFont font = new WritableFont(WritableFont.ARIAL, 14, WritableFont.BOLD);
                headerFormat.setFont(font);
                headerFormat.setBackground(Colour.AQUA);
                headerFormat.setWrap(true);
                
                for(int i = 0; i < model.getColumnCount(); i++) {
                    Label headerLabel = new Label(i, 0, model.getColumnName(i), headerFormat);
                    sheet.addCell(headerLabel);
                }
                sheet.insertRow(1);
                for(int i = 0; i < model.getRowCount(); i++) {
                    for(int j = 0; j < model.getColumnCount(); j++) {
                        Label label = new Label(j, i+1, model.getValueAt(i, j).toString());
                        sheet.addCell(label);
                    }
                }
                wb.write();
                wb.close();
                status = true;
            }
        } catch(Exception e){ 
            
        }
        return status;
        
    }
    
    private void generateGraphBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateGraphBtnActionPerformed
        generateChart();
    }//GEN-LAST:event_generateGraphBtnActionPerformed
    
    private void generateChart() {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ChartGeneratorGraph(taskTable);
            }
        });
    }
    
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       
       DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
       
       try {
           
           model.setRowCount(0);
           
       } catch(Exception e) {
           
       }
       
    }//GEN-LAST:event_clearBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed
        
        try {
            File file = importExcelFile();
            if(file != null && file.getName().endsWith(".xls"))
                taskTable.setModel(getModelFromExcel(file));
        } catch(Exception e) {
            
        }
        
        
    }//GEN-LAST:event_importBtnActionPerformed

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        addBtn.setBackground(Color.CYAN);
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
       addBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_addBtnMouseExited

    private void completeTaskBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeTaskBtnMouseEntered
        completeTaskBtn.setBackground(Color.GREEN);
    }//GEN-LAST:event_completeTaskBtnMouseEntered

    private void completeTaskBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeTaskBtnMouseExited
        completeTaskBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_completeTaskBtnMouseExited

    private void deleteTaskBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTaskBtnMouseEntered
        deleteTaskBtn.setBackground(Color.RED);
    }//GEN-LAST:event_deleteTaskBtnMouseEntered

    private void deleteTaskBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTaskBtnMouseExited
        deleteTaskBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_deleteTaskBtnMouseExited

    private void clearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseEntered
       clearBtn.setBackground(Color.YELLOW);
    }//GEN-LAST:event_clearBtnMouseEntered

    private void clearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseExited
       clearBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_clearBtnMouseExited

    private void saveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseEntered
        saveBtn.setBackground(Color.CYAN);
    }//GEN-LAST:event_saveBtnMouseEntered

    private void saveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseExited
        saveBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_saveBtnMouseExited

    private void importBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importBtnMouseEntered
       importBtn.setBackground(Color.YELLOW);
    }//GEN-LAST:event_importBtnMouseEntered

    private void importBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importBtnMouseExited
        importBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_importBtnMouseExited

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        exitBtn.setBackground(Color.RED);
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        exitBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_exitBtnMouseExited

    private void generateGraphBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateGraphBtnMouseEntered
       generateGraphBtn.setBackground(Color.GREEN);
    }//GEN-LAST:event_generateGraphBtnMouseEntered

    private void generateGraphBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateGraphBtnMouseExited
        generateGraphBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_generateGraphBtnMouseExited

    private DefaultTableModel getModelFromExcel(File file) {
        
        Vector headers = new Vector();
        Vector data = new Vector();
        
        DefaultTableModel model = new DefaultTableModel(data, headers);
        
        try {
            Workbook workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
            headers.clear();
            for (int i = 0; i < 4; i++) {
                Cell cell1 = sheet.getCell(i, 0);
                headers.add(cell1.getContents());
            }
            data.clear();
            for (int j = 1; j < sheet.getRows(); j++) {
                Vector d = new Vector();
                for (int i = 0; i < sheet.getColumns(); i++) {
                    Cell cell = sheet.getCell(i, j);
                    d.add(cell.getContents());
                }
                d.add("\n");
                data.add(d);
            }
        } catch (Exception e) {
            
        }
        
        return model;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
    }
    
    public File importExcelFile() {
        
        File file = null;
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Choose a .xls file to import");
            
            int userSelection = fileChooser.showOpenDialog(this);
            
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    file = fileToSave.getAbsoluteFile();
            }
        } catch(Exception e) {

        }
        return file;
        
    }
    
    public File selectADestinationToSave() {
        
        File file = null;
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("NOTE: save your file with .png extension.");

            int userSelection = fileChooser.showSaveDialog(this);
            
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    file = fileToSave.getAbsoluteFile();
            }
        } catch(Exception e) {

        }
        return file;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton completeTaskBtn;
    private javax.swing.JButton deleteTaskBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton generateGraphBtn;
    private javax.swing.JButton importBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel navLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel taskLabel;
    private javax.swing.JTable taskTable;
    private javax.swing.JTextArea taskTextArea;
    // End of variables declaration//GEN-END:variables
}
