package co.edu.uniquindio.patronstrategy.pagoapp.ViewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.patronstrategy.pagoapp.Contexto.CarritoDeCompra;
import co.edu.uniquindio.patronstrategy.pagoapp.EstrategiasConcretas.TarjetaCreditoPago;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TarjetaCreditoViewController{

    CarritoDeCompra carritoDeCompra = new CarritoDeCompra();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnPagoTarjeta;

    @FXML
    private TextField txtCVV;

    @FXML
    private TextField txtFechaExp;

    @FXML
    private TextField txtMonto;

    @FXML
    private TextField txtNumTarjeta;

    @FXML
    private TextArea txtInfo;

    @FXML
    void onPagoTarjeta(ActionEvent event) {
        crearPago();
    }

    @FXML
    void initialize() {

    }

    private void crearPago() {
        carritoDeCompra.elegirPago(new TarjetaCreditoPago(txtNumTarjeta.getText(),txtFechaExp.getText(),txtCVV.getText()));
        int monto = Integer.parseInt(txtMonto.getText());
        String informacionPago = carritoDeCompra.resultado(monto);
        txtInfo.appendText(informacionPago + "\n");
    }

}