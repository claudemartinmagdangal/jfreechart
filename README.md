JFREE CHART
=============================

## How to run the application

• Make sure you have java JDK/JRE version 11 or above installed in your local machine.

• Open the **jfreechart** source code in your IntelliJ IDE.

• Navigate through **src > main > java > io.jfreechart > Main**

• Hit the run button (colored green play button) in line number 25 on the left part of the workspace

## How to use JFree Chart application

Everytime you want to add a new task, just type the task details in the left panel box. Hit `ADD` button. You may add as many task as you want.

If a specific task or tasks are done, you can select each all and hit `COMPLETE` button.

You may clear the table by hitting the `CLEAR` button.

You may delete 1 or more tasks in the table by hitting the `DELETE` button.

You can import saved tasks in your local machine by hitting the `IMPORT` button. By doing so, you have to select a vaild excel file that contains all your saved tasks.

## NOTE
There will be no persistence upon exiting the application. It means that all tasks in the table will be deleted unless If you need to store the task details in your local machine, you may save all tasks using the `SAVE` button.

## Buttons and Functionalities

### ADD

Clicking this button will add the tasks entered from the left panel into the table. You can add multiple tasks.

### COMPLETE

Clicking this button will change the status of each selected tasks in the table into `completed` and will also add the completed date in the table. You can complete 1 or more task in a single click just by selecting 1 or more tasks.

### CLEAR

This will clear all tasks inside the table.

### DELETE

This will delete task in the table. You can delete 1 or more tasks by selecting each.

### SAVE

This button will save the tasks details into you local machine.

Do this before exiting the application so that you will have a copy to import upon the next usage of the application.

### CHART

This button will generate a line graph of activities representing two lines (assigned tasks vs completed tasks).

You can save the graph into your local machine if needed for reference.

### IMPORT

Use this to import your saved tasks from the excel file.

### EXIT

Use this button to properly exit the application. Clicking the `X` button will not do anything. 