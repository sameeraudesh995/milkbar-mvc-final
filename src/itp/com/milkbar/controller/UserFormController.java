
package itp.com.milkbar.controller;

        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.image.ImageView;
        import javafx.event.ActionEvent;

public class UserFormController {

    @FXML
    private ComboBox<String> txtEmpID;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtRole;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnRemove;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private ImageView backIcon;

    @FXML
    private void btnSaveOnAction(ActionEvent event) {
        System.out.println("Save button clicked!");
        // Implement save functionality here
    }

    @FXML
    private void btnRemoveOnAction(ActionEvent event) {
        System.out.println("Clear button clicked!");
        clearFields();
    }

    @FXML
    private void btnUpdateOnAction(ActionEvent event) {
        System.out.println("Update button clicked!");
        // Implement update functionality here
    }

    @FXML
    private void btnDeleteOnAction(ActionEvent event) {
        System.out.println("Delete button clicked!");
        // Implement delete functionality here
    }

    @FXML
    private void onClickBackAction() {
        System.out.println("Back button clicked!");
        // Implement back navigation here
    }

    private void clearFields() {
        txtEmpID.getSelectionModel().clearSelection();
        txtUserName.clear();
        txtPassword.clear();
        txtRole.clear();
    }
}
