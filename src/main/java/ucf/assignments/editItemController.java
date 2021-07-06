package ucf.assignments;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class editItemController {

    @FXML
    private TableView<?> itemInfo;

    @FXML
    private TableColumn<?, ?> itemDueDate;

    @FXML
    private TableColumn<?, ?> itemDescription;

    @FXML
    private TableColumn<?, ?> completionStatus;

    @FXML
    private Button backButton;

}