
package itp.com.milkbar.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ItemFormController {

    @FXML
    private Button btnSave;

    @FXML
    private Button btnRemove;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private TextField txtItemCode;

    @FXML
    private TextField txtItemName;

    @FXML
    private TextField txtUnitPrice;

    @FXML
    private TextField txtQtyOnHand;

    @FXML
    private TextField txtSearch;

    @FXML
    private TableView<?> tblItem;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableColumn<?, ?> colQtyOnHand;

    @FXML
    private ImageView btnBack;

    // Handle Save Button Action
    @FXML
    void btnSaveOnAction(ActionEvent event) {
        System.out.println("Save button clicked!");
        // Add save logic here
    }

    // Handle Remove Button Action
    @FXML
    void btnRemoveOnAction(ActionEvent event) {
        System.out.println("Remove button clicked!");
        // Add remove/clear logic here
    }

    // Handle Update Button Action
    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        System.out.println("Update button clicked!");
        // Add update logic here
    }

    // Handle Delete Button Action
    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        System.out.println("Delete button clicked!");
        // Add delete logic here
    }

    // Handle Key Pressed in TextField for Item Code
    @FXML
    void keyPressedEnterOnAction(ActionEvent event) {
        System.out.println("Enter key pressed in Item Code TextField.");
        // Add search or navigation logic here
    }

    // Handle Search TextField Key Pressed Event
    @FXML
    void lblSearchOnAction(ActionEvent event) {
        System.out.println("Search action triggered.");
        // Add search logic here
    }

    // Handle Back Button Click Event
    @FXML
    void btnBackOnClickAction(ActionEvent event) {
        System.out.println("Back button clicked!");
        // Add navigation or back logic here
    }
}
