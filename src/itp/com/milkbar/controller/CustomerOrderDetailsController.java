package itp.com.milkbar.controller;


        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.input.MouseEvent;

        import java.util.ArrayList;
        import java.util.List;

public class CustomerOrderDetailsController {

    public TableColumn colItemCode;
    public TableColumn colItemName;
    public TableColumn colQty;
    public TableColumn colUnitPrice;
    public TableColumn colTotal;
    @FXML
    private ComboBox<String> cmbCustomerId;

    @FXML
    private ComboBox<String> cmbItemCode;

    @FXML
    private TextField txtQty;

    @FXML
    private Label lblOrderId;

    @FXML
    private Label lblOrderDate;

    @FXML
    private Label lblCustomerName;

    @FXML
    private Label lblNetTotal;

    @FXML
    private Label lblItemName;

    @FXML
    private Label lblUnitPrice;

    @FXML
    private Label lblQtyOnHand;

    @FXML
    private TableView<?> tblOrderCart;

    private List<?> cart = new ArrayList<>();

    @FXML
    public void initialize() {

    }

    private void loadCustomerIds() {

    }

    private void loadItemCodes() {

    }

    private void generateNewOrderId() {

    }

    @FXML
    private void cmbItemOnAction(ActionEvent event) {

    }

    @FXML
    private void btnAddToCartOnAction(ActionEvent event) {

    }

    @FXML
    private void btnPlaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    private void btnNewCustomerOnAction(ActionEvent event) {

    }

    @FXML
    private void onClickedBackButton(MouseEvent event) {

    }
}
