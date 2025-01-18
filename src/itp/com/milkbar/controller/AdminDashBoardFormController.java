package itp.com.milkbar.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class AdminDashBoardFormController {
    public BorderPane mainPane;
    public AnchorPane mainContentPane;

    public void btnCustomerOnAction(ActionEvent actionEvent) {
        try {
            setUi("CustomerForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnEmployeeOnAction(ActionEvent actionEvent) {
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) {
    }

    public void btnOrderOnAction(ActionEvent actionEvent) {
        try {
            setUi("CustomerOrderDetailsForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void btnItemOnAction(ActionEvent actionEvent) {
    }

    public void btnPaymentOnAction(ActionEvent actionEvent) {
        try {
            setUi("PaymentForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnReportOnAction(ActionEvent actionEvent) {
    }

    public void btnUserOnAction(ActionEvent actionEvent) {
        try {
            setUi("UserForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setUi(String location) throws IOException {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/itp/com/milkbar/view/"+location+".fxml"));
            AnchorPane childPane = loader.load();


            mainContentPane.getChildren().clear();
            mainContentPane.getChildren().add(childPane);

            AnchorPane.setTopAnchor(childPane, 0.0);
            AnchorPane.setBottomAnchor(childPane, 0.0);
            AnchorPane.setLeftAnchor(childPane, 0.0);
            AnchorPane.setRightAnchor(childPane, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
