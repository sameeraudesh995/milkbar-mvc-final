package itp.com.milkbar.controller;


        import itp.com.milkbar.db.dbAccessCode.employee.EmployeeAccessCode;
        import itp.com.milkbar.model.Employee;
        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.input.KeyEvent;

        import java.sql.SQLException;

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

    public void initialize(){
        try {
            autoGenerateEmpId();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnDeleteOnAction() {




    }

    @FXML
    void btnSaveOnAction()  {
        Employee employee = new Employee(txtId.getText(),
             txtName.getText() ,
             txtEmail.getText(),
             txtAddress.getText(),
           Double.parseDouble( txtSalary.getText())
        );
        try{
            boolean isEmployeeSave= new EmployeeAccessCode().employeeRegister(employee);

            if(isEmployeeSave){
               new Alert(Alert.AlertType.INFORMATION, "Employee Register Successful").show();
               clearField();
            } else {
            new Alert(Alert.AlertType.WARNING, "Try Again").show();
        }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }


    }

    @FXML
    void btnUpdateOnAction() {

    }

    @FXML
    void btnRemoveOnAction() {

        clearField();
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

    private String generateNextEmpId() throws SQLException, ClassNotFoundException {
        String empId = getLastEmpId();

        if (empId == null || empId.isEmpty()) {
            return "EMP0001";
        }


        int numericPart = Integer.parseInt(empId.substring(3));
        numericPart++;


        return String.format("EMP%04d", numericPart);
    }
    private String getLastEmpId() throws ClassNotFoundException, SQLException {
        String lastId = EmployeeAccessCode.getEmpId();

        if (lastId==null){
            return null;
        }
        return lastId;
    }

    private void autoGenerateEmpId() throws SQLException, ClassNotFoundException {
        String newUserId = generateNextEmpId();
        txtId.setText(newUserId);
        txtId.setEditable(false);
    }

    private void clearField(){
        txtId.clear();
        txtName.clear();
        txtAddress.clear();
        txtEmail.clear();
        txtSalary.clear();
    }
}
