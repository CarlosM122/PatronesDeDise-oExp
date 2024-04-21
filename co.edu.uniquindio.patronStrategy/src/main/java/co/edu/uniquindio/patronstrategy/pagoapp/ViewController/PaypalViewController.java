package co.edu.uniquindio.patronstrategy.pagoapp.ViewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.patronstrategy.pagoapp.Contexto.CarritoDeCompra;
import co.edu.uniquindio.patronstrategy.pagoapp.EstrategiasConcretas.PaypalPago;
import co.edu.uniquindio.patronstrategy.pagoapp.EstrategiasConcretas.TarjetaCreditoPago;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PaypalViewController {

    CarritoDeCompra carritoDeCompra = new CarritoDeCompra();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnPagoTarjeta;

    @FXML
    private TextField txtContraseña;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextArea txtInfo;

    @FXML
    private TextField txtMonto;

    @FXML
    void onPagoPaypal(ActionEvent event) {
        crearPago();
    }

    @FXML
    void initialize() {
    }

    private void crearPago() {
        carritoDeCompra.elegirPago(new PaypalPago(txtCorreo.getText(),txtContraseña.getText()));
        int monto = Integer.parseInt(txtMonto.getText());
        String informacionPago = carritoDeCompra.resultado(monto);
        txtInfo.appendText(informacionPago + "\n");
    }
}
