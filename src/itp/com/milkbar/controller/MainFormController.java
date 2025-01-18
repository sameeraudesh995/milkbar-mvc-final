package itp.com.milkbar.controller;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainFormController {
    public ImageView closeImg;
    public AnchorPane context;

    public void initialize(){

    }

    public void cashierLoginOnAction(ActionEvent actionEvent) {
        try {
            setUi("LoginForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void adminLoginOnAction(ActionEvent actionEvent) {
        try {
            setUi("AdminLoginForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void handleCloseApplication(MouseEvent mouseEvent) {
        Platform.exit();
    }

    private void setUi(String location) throws IOException {
        Stage primaryStage = new Stage();

            URL resource = this.getClass().getResource("/itp/com/milkbar/view/"+location+".fxml");
            Parent window = FXMLLoader.load(resource);
            Scene scene = new Scene(window);
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();

            Stage currentStage = (Stage) context.getScene().getWindow();
            currentStage.close();
            primaryStage.show();

    }
}
