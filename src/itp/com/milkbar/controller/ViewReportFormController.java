
package itp.com.milkbar.controller;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Alert;
        import javafx.scene.control.Button;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.AnchorPane;

public class ViewReportFormController {

    @FXML
    private AnchorPane pane;

    @FXML
    private ImageView backButton;

    @FXML
    private ImageView customerReportIcon;

    @FXML
    private ImageView employeeReportIcon;

    @FXML
    private ImageView dailySaleIcon;

    @FXML
    private Button viewCustomerReportButton;

    @FXML
    private Button viewEmployeeReportButton;

    @FXML
    private Button viewDailySaleReportButton;

    // Handles the back button click event
    @FXML
    private void ClickOnBackButton() {
        // Implement navigation logic here (e.g., go to the previous screen)
        showAlert("Back Button Clicked", "Navigate to the previous screen.");
    }

    // Handles the customer report icon click event
    @FXML
    private void CustomerOnClicked() {
        // Implement logic for viewing customer report
        showAlert("Customer Report", "View customer report functionality triggered.");
    }

    // Handles the employee report icon click event
    @FXML
    private void ClickOnActionEmployee() {
        // Implement logic for viewing employee report
        showAlert("Employee Report", "View employee report functionality triggered.");
    }

    // Handles the daily sale icon click event
    @FXML
    private void ClickOnDailySale() {
        // Implement logic for viewing daily sale report
        showAlert("Daily Sale Report", "View daily sale report functionality triggered.");
    }

    // Handles the "View Customer Report" button click event
    @FXML
    private void viewCustomerReport(ActionEvent event) {
        CustomerOnClicked();
    }

    // Handles the "View Employee Report" button click event
    @FXML
    private void viewEmployeeReport(ActionEvent event) {
        ClickOnActionEmployee();
    }

    // Handles the "View Daily Sale Report" button click event
    @FXML
    private void viewDailySaleReport(ActionEvent event) {
        ClickOnDailySale();
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
