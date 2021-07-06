package ucf.assignments;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class TodoLists extends Application{
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TodoListsController.fxml"));
        primaryStage.setScene(new Scene(root, 400,600));
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
    class todoListMaker{
        //creates todoList using input from controller class
        //calls maketitle() method to make the todolist title
        //calls getCapacity() method to get the itemCapacity
        //calls additem() method to add items to list
    }
    class capacity extends todoListMaker{
        //int items initialized
        //boolean containsItems(){
        // if items is greater than 100 returns true
        // else
        // returns false
        // }
        // contains add items method which adds items
        //using methods from the item class
    }
    class title extends  todoListMaker{
        //String makeTitle(){
        // gets a title from the GUI
        // }
    }
    class item extends todoListMaker{
        //initializes itemDescription
        //initalizes String date
        //Item obj equals new Item()
        //String getCapacity(int capacity){
        // capacityList equals capacity
        // returns capacityList
        // } void addItem(String item){
        // getItem() gets item
        // setItem() sets item
        // itemDescription.setDescription()
        // date.makeCurrentDate() gets new date
    }
    //import java time package
    class Date extends item{
        //public String getCurrentDate(){
        //creates DateTimeFormat(yyyy-mm-dd) object
        //creates current Date
        //initialize String date;
        //return date value;
        //}
    }
    class itemNumber extends item{
        //initializes itemMax to 100
        //boolean false;
        //public boolean checkItem(int number){
        //if item greater than itemMax
        //boolean equals true
        // return true;
        // }
    }
    class itemDescription extends item{
        //public String getItemDescription(String itemDescription){
        // returns the item Description
        // }
        //public void setItemDescription(itemDescription){
        // itemDescription sets itemDescription
        // }
    }
}
