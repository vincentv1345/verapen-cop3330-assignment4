import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class testCases {
    @Test
    public void addTodoList(String todoList,String []todoListArray){
        //initialize newTodoListArray while i is less than or equal
        // to todoList length add i make todoList equal to newTodoListArray[i]
        // newTodoListArray return newTodoListArray should equal to
    }
    @Test
    public String[] removeTodoList(String todoList, String[]todoListArray){
        //initialize String removeList[] while todoList doesn't equal todoListArray[i]
        //add 1 to i
        //removeList equals todoListArray[i].remove(todoListArray[i])
        return todoListArray;//returns this for now will return removeList
    }
    @Test
    public String editTitle(String newTitle, String listTitle){
        //listTitle equals First
        //newTitle equals Second
        //listTitle assertEquals Second
        //initialize String newTitle
        //Sets listTitle equal to NewTitle
        //returns listTitle
        return "";//will return the listTitle
    }
    @Test
    public String[] addNewItem(String newItem, String itemList[]){
        //will test array of new item equals car itemList equals bike, motorcycle
        //newItemList assertequals bike, motorcycle, car
        //newItemList array is initialized
        //newItemList equals itemList add newItem
        return itemList;//will change to new ItemList
    }
    @Test
    public String [] removeItem(String item, String itemList[]){
        //will test array of bike, motorcycle, car and should equal
        //removedItemList assert equals bike, motorcyle
        //returns removedItemList
        return itemList;//nothing for now
    }
    @Test
    public String editDescription(String newDescription){
        //description equals New Product
        //newDescription equals Old Product
        //editDescription should equals Old Product
        //editDescription(newDescription)
        //returns newDescription;
        return "";//nothing for now
    }
    @Test
    public String editDueDate(){
        //expected string = {"1998-11-09"}
        //editDueDate(dueDate)
        //getDueDate() from itemString[i]
        //initializes due date
        //dueDate set newDueDate()
        //returns dueDate
        return "";
    }
    @Test
    public boolean Mark(boolean Status){
        //expected status equals false
        //checkItemStatus(status)
        return false;//false for now until tested
    }
    @Test
    public String status(boolean check){
        //check = false
        //if checkItemStatus(check)
        //should return not completed
        return "";//false for now
    }
    public String print(String ListItem[]){
        //printList(List)
        //should print all itemsInList
        return "";
    }
    public String printIncompletedItems(String listItems[]){
        //initialize listItems[]
        //print IncompletedItems(listItems[])
        return "";//nothing for now
    }
    public String printCompletedItems(String listItems[]){
        //printExistItem(listItem[])
        return "";
    }
    public void save(String list[],String items[]){
        //get list
        //for i equals zero i is less than items length getItems from list
        //save(list[i].getItems[i]) to storage
    }
    public void saveALl(String list[], String items[]){
        //for i equals zero i is less than list length then add i by one
        // save(list[i])
        //for j equals zero then j is less than item length then add j by one
        //save(list[i].getItems[j])
    }

}
