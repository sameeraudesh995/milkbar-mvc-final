package itp.com.milkbar.controller;


        import javafx.fxml.FXML;
        import javafx.scene.control.Label;
        import javafx.scene.control.TableColumn;
        import javafx.scene.control.TableView;
        import javafx.scene.control.TextField;
        import javafx.scene.input.KeyEvent;

public class EmployeeFormController {

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtSalary;

    @FXML
    private TextField txtSearch;

    @FXML
    private TableView<?> tblEmployee;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private Label lblStatus;

    @FXML
    void btnDeleteOnAction() {


    }

    @FXML
    void btnSaveOnAction() {
        
    }

    @FXML
    void btnUpdateOnAction() {

    }

    @FXML
    void btnRemoveOnAction() {

        txtId.clear();
        txtName.clear();
        txtAddress.clear();
        txtEmail.clear();
        txtSalary.clear();
        System.out.println("Form cleared");
    }

    @FXML
    void txtSearchOnAction(KeyEvent event) {

    }

    @FXML
    void EnterKeyPressedOnAction(KeyEvent event) {

    }

    @FXML
    void onClickBackButton() {

    }
}
