package itp.com.milkbar.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;

public class SupplierPaymentController {

    @FXML
    private ComboBox<String> cmbCustomerID;

    @FXML
    private Label supplierName;

    @FXML
    private Label date;

    @FXML
    private Label time;

    @FXML
    private Label paymentId;

    @FXML
    private JFXButton btnCancel;

    @FXML
    private void cmbSupplierID(ActionEvent event) {

    }

    @FXML
    private void PaymentSuccessFully(ActionEvent event) {

    }

    @FXML
    private void btnCancelAction(ActionEvent event) {

    }

    // Resets the form fields
    private void resetForm() {

        supplierName.setText("");
        date.setText("");
        time.setText("");
        paymentId.setText("");
    }

    // Utility method to show an alert dialog
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
