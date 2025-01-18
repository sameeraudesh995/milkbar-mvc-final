package itp.com.milkbar.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CashierDashBoardFormController {

    public BorderPane mainPane;
    @FXML
    private AnchorPane mainContentPane;

    @FXML
    private Button customerButton;

    @FXML
    private Button supplierButton;

    @FXML
    private Button orderButton;

    @FXML
    private Button paymentButton;

    @FXML
    private Button logoutButton;

    @FXML
    private VBox sideBar;

    @FXML
    private Label headerLabel;

    @FXML
    private Label dateLabel;

    @FXML
    private ImageView dashboardImage;

    @FXML
    private ImageView customerIcon;

    @FXML
    private ImageView supplierIcon;

    @FXML
    private ImageView orderIcon;

    @FXML
    private ImageView paymentIcon;

    @FXML
    private ImageView logoutIcon;


    @FXML
    public void initialize() {

        startDateTimeDisplay();
    }

    @FXML
    private void btnCustomerOnAction() {
       
    }

    @FXML
    private void btnSupplierOnAction() {
       
    }

    @FXML
    private void btnOrderOnAction() {
        
    }

    @FXML
    private void btnPaymentOnAction() {
        
    }

    @FXML
    private void btnLogoutOnAction() {
        
    }

    private void startDateTimeDisplay() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), event -> {
                    LocalDateTime now = LocalDateTime.now();
                    dateLabel.setText(formatter.format(now));
                }),
                new KeyFrame(Duration.seconds(1))
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
