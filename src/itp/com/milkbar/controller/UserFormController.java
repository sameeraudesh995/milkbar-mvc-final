
package itp.com.milkbar.controller;

        import itp.com.milkbar.db.dbAccessCode.employee.EmployeeAccessCode;
        import itp.com.milkbar.db.dbAccessCode.user.UserAccessCode;
        import itp.com.milkbar.model.Employee;
        import itp.com.milkbar.model.User;
        import itp.com.milkbar.util.PasswordEncoder;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.image.ImageView;
        import javafx.event.ActionEvent;

        import java.sql.SQLException;
        import java.util.List;

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

    public void initialize(){
        try {
            loadEmployeeId();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    private void btnSaveOnAction(ActionEvent event) {

        User user = new User(txtEmpID.getValue(),
                PasswordEncoder.encode(txtPassword.getText() ),
                txtUserName.getText(),
                txtRole.getText()
        );
        try{
            boolean isUserSaved= new UserAccessCode().userRegister(user);

            if(isUserSaved){
                new Alert(Alert.AlertType.INFORMATION, "User Register Successful").show();
                clearFields();
                loadEmployeeId();
            } else {
                new Alert(Alert.AlertType.WARNING, "Try Again").show();
            }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    @FXML
    private void btnRemoveOnAction(ActionEvent event) {

        clearFields();
    }

    @FXML
    private void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    private void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    private void onClickBackAction() {

    }

    private void loadEmployeeId() throws SQLException, ClassNotFoundException {

            ObservableList<String> obsList = new UserAccessCode().getAllEmployeeIds();

            txtEmpID.setItems(obsList);
    }

    private void clearFields() {
        txtEmpID.getSelectionModel().clearSelection();
        txtUserName.clear();
        txtPassword.clear();
        txtRole.clear();
    }
}
