package itp.com.milkbar.controller;


        import itp.com.milkbar.db.dbAccessCode.employee.EmployeeAccessCode;
        import itp.com.milkbar.model.Employee;
        import itp.com.milkbar.view.tm.EmployeeTM;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.collections.transformation.FilteredList;
        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.control.cell.PropertyValueFactory;
        import javafx.scene.input.KeyCode;
        import javafx.scene.input.KeyEvent;

        import java.sql.SQLException;
        import java.util.List;

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
    private TableView<EmployeeTM> tblEmployee;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn  colAddress;

    @FXML
    private TableColumn  colEmail;

    @FXML
    private TableColumn colSalary;

    @FXML
    private Label lblStatus;

    public void initialize() throws SQLException, ClassNotFoundException {
        try {
            autoGenerateEmpId();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        loadEmployee();
        colID.setCellValueFactory(new PropertyValueFactory<>("empId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        tblEmployee.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {

                txtId.setText(newValue.getEmpId());
                txtName.setText(newValue.getName());
                txtEmail.setText(newValue.getEmail());
                txtAddress.setText(newValue.getAddress());
                txtSalary.setText(String.valueOf(newValue.getSalary()));
            }
        });


    }

    private void loadEmployee(){
        ObservableList<EmployeeTM> tmList = FXCollections.observableArrayList();
        try{
            for (Employee e: new EmployeeAccessCode().findAll()){
                tmList.add(new EmployeeTM(e.getEmpId(),e.getName(),e.getEmail(),e.getAddress(),e.getSalary()));
            }
            tblEmployee.setItems(tmList);
        }catch (ClassNotFoundException | SQLException e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }



    @FXML
    void btnDeleteOnAction() {
        String status ="notAvailable";
        Employee employee = new Employee(
                txtId.getText(),
                txtName.getText(),
                txtEmail.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText()),
                status



        );
        try{
            boolean isDelete = new EmployeeAccessCode().delete(employee);

            if(isDelete){
                new Alert(Alert.AlertType.INFORMATION,"Employee Delete successful").show();
                clearField();
                loadEmployee();
                autoGenerateEmpId();
            }else {
                new Alert(Alert.AlertType.WARNING, "Something went wrong");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    @FXML
    void btnSaveOnAction()  {
        String status ="Available";
        Employee employee = new Employee(txtId.getText(),
             txtName.getText() ,
             txtEmail.getText(),
             txtAddress.getText(),
           Double.parseDouble( txtSalary.getText()),
                status
        );
        try{
            boolean isEmployeeSave= new EmployeeAccessCode().employeeRegister(employee);

            if(isEmployeeSave){
               new Alert(Alert.AlertType.INFORMATION, "Employee Register Successful").show();
               clearField();
               loadEmployee();
               autoGenerateEmpId();
            } else {
            new Alert(Alert.AlertType.WARNING, "Try Again").show();
        }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }


    }

    @FXML
    void btnUpdateOnAction() {
        String status ="Available";
        Employee employee = new Employee(
                txtId.getText(),
                txtName.getText(),
                txtEmail.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText()),
                status



        );
        try{
            boolean isUpdate = new EmployeeAccessCode().update(employee);

            if(isUpdate){
                new Alert(Alert.AlertType.INFORMATION,"Employee Update successful").show();
                clearField();
                loadEmployee();
                autoGenerateEmpId();
            }else {
                new Alert(Alert.AlertType.WARNING, "Something went wrong");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnRemoveOnAction() {

        clearField();
        try {
            autoGenerateEmpId();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void txtSearchOnAction(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            String id = txtSearch.getText();


            try {
                Employee employee = new EmployeeAccessCode().find(id);
                if (employee != null) {
                    fillData(employee);
                    txtSearch.clear();

                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @FXML
    void EnterKeyPressedOnAction(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            String id = txtId.getText();


            try {
                Employee employee = new EmployeeAccessCode().find(id);
                if (employee != null) {
                    fillData(employee);

                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

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

    private void fillData(Employee employee){
        txtId.setText(employee.getEmpId());
        txtName.setText(employee.getName());
        txtEmail.setText(employee.getEmail());
        txtAddress.setText(employee.getAddress());
        txtSalary.setText(String.valueOf(employee.getSalary()));
    }
}
