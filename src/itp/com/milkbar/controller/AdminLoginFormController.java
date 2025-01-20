package itp.com.milkbar.controller;

import itp.com.milkbar.db.dbAccessCode.loginAccess.LoginAccessCode;
import itp.com.milkbar.util.PasswordEncoder;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class AdminLoginFormController {
    public TextField loginUserName;
    public TextField LoginPassword;
    public AnchorPane context;

    public void loginOnAction(ActionEvent actionEvent) {
        try {
            String userResult = new LoginAccessCode().adminLogin(loginUserName.getText());
            if (userResult != null) {
                if (PasswordEncoder.check(
                        LoginPassword.getText(),
                        userResult
                )) {

            setUi("AdminDashBoardForm");
        new Alert(Alert.AlertType.INFORMATION, loginUserName.getText() + " is Logging Successfully!",
                            ButtonType.OK).show();

                } else {
                    new Alert(Alert.AlertType.WARNING, "password is wrong!",
                            ButtonType.OK).show();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
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

    public void goToMainForm(MouseEvent mouseEvent) {
    }
}
