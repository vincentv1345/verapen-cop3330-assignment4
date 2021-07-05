package ucf.assignments;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
public class TodoListsControllers {
    //@FXML
    //initialize controller String array listOfLists
    //@FXML
    // initialize a controller String array listOfItems
    //@FXML
    //void add List(MouseEvent event){
    //adds todolist to the list interface
    // }
    //@FXML
    //void removeList(MouseEvent event){
    // removes todoLists from the list of todolists
    // }
    public String makeTodoList(){
       //Make todoList using makeTodoList method
       //return todoList to todoListDataBaseClass
        return "";
    }
    class todoListDataBase {
        //gets todolists from user
        //initializes int MaxLists
        //initializes int lists
        //initializes todoLists[]
        //initializes itemList[]
        //gets number of TodoLists and puts in lists
        //boolean
    }
    class editTodoList{
        public String editDueDate(String date){
        //String new date = date
        return "";//returns nothing for now
        }
        public String editTitle(String title){
            //String newTitle = title
            //returns newTitle
            return "";//nothing for now
        }
        public String addItemToList(String item, String []list){
            //new item equals item
            //if list length is equal to or less than 100
            //list.add(item)
            return "";//return new list nothing for now
        }
        public String editDescription(String []listOfLists, String description, String []itemOfList, String item){
            // get list with listOfLists[] array
            //get listItem with itemOfList[] array
            //while item doesn't equal itemOfList[i]
            // adds 1 to i
            //itemDescription of item[i] equals newDescription
            return "";//will return description of item
        }
    }
}
class displayInformation{
    public void displayList(String listContents){
        //makes loop to read in todoList array contents
        //calls print function in order to print the todoList contents
        //for each list
    }
}
class itemCompletion extends displayInformation{
    public boolean checkCompletion(){
        //checks if item is complete
        //a boolean value will return false if
        //the item contains nothing in it's description
        //the boolean value will also return false if no
        //value is entered for the date
        return true;//true for now
    }
}
