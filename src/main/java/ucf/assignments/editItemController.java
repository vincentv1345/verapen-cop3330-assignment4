package ucf.assignments;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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