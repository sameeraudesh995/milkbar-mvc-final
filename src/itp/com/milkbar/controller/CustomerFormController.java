package itp.com.milkbar.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class CustomerFormController {

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtTelNumber;

    @FXML
    private TextField textSearch;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnClear;

    @FXML
    private TableView<?> tblCustomer; 

    @FXML
    private TableColumn<?, ?> colID; 
    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colTelNumber;

    @FXML
    private ImageView backIcon;

    @FXML
    private ImageView customerIcon;

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        System.out.println("Save button clicked");
        // Implement save functionality
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        System.out.println("Update button clicked");
        // Implement update functionality
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        System.out.println("Delete button clicked");
        // Implement delete functionality
    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        System.out.println("Clear button clicked");
        // Clear all text fields
        txtId.clear();
        txtName.clear();
        txtAddress.clear();
        txtTelNumber.clear();
        textSearch.clear();
    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {
        System.out.println("Search triggered");
        String searchQuery = textSearch.getText();
        // Implement search functionality
    }

    @FXML
    void txtCustomerIdOnAction(ActionEvent event) {
        System.out.println("Customer ID entered: " + txtId.getText());
        // Add logic if necessary
    }

    @FXML
    void onClickBack() {
        System.out.println("Back button clicked");
        // Implement navigation to the previous screen
    }

    public void name(KeyEvent keyEvent) {
    }

    public void address(KeyEvent keyEvent) {
    }

    public void contact(KeyEvent keyEvent) {
    }
}
