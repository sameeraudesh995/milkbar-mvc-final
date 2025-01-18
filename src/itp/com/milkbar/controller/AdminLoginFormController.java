package itp.com.milkbar.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminLoginFormController {
    public TextField loginUserName;
    public TextField LoginPassword;
    public AnchorPane context;

    public void loginOnAction(ActionEvent actionEvent) {
        try {
            setUi("AdminDashBoardForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void signUpOnAction(MouseEvent mouseEvent) {
    }

    public void frogotPasswordOnAction(MouseEvent mouseEvent) {
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
