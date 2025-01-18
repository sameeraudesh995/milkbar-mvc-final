package itp.com.milkbar.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class PaymentController {

    @FXML
    private AnchorPane pane;

    @FXML
    private ImageView btnBackOnAction;

    @FXML
    private ImageView CustomerClickedOnAction;

    @FXML
    private ImageView SupplierPaymentClickedOnAction;

    @FXML
    void btnBackOnAction() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Navigation");
        alert.setHeaderText(null);
        alert.setContentText("Navigating to the previous screen...");
        alert.showAndWait();
    }

    @FXML
    void CustomerClickedOnAction() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Customer Payment");
        alert.setHeaderText(null);
        alert.setContentText("Customer payment process initiated.");
        alert.showAndWait();
    }

    @FXML
    void SupplierPaymentClickedOnAction() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Supplier Payment");
        alert.setHeaderText(null);
        alert.setContentText("Supplier payment process initiated.");
        alert.showAndWait();
    }
}
