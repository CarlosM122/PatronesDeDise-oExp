package co.edu.uniquindio.patrondecorator.cafeapp.ViewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.patrondecorator.cafeapp.Decorator.Caramelo;
import co.edu.uniquindio.patrondecorator.cafeapp.Decorator.Leche;
import co.edu.uniquindio.patrondecorator.cafeapp.Model.Cafe;
import co.edu.uniquindio.patrondecorator.cafeapp.Model.CafeDoble;
import co.edu.uniquindio.patrondecorator.cafeapp.Model.CafeSimple;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

public class CafeViewController {

    private Cafe cafe;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearOrden;

    @FXML
    private RadioButton rdbCafeDoble;

    @FXML
    private RadioButton rdbCafeSimple;

    @FXML
    private RadioButton rdbCaramelo;

    @FXML
    private RadioButton rdbLeche;

    @FXML
    private TextArea txtInfo;

    @FXML
    void onCrearOrden(ActionEvent event) {
        crearOrden();

    }

    @FXML
    void initialize() {
    }

    private void crearOrden() {
        if(rdbCafeSimple.isSelected()&&rdbCafeDoble.isSelected()){
            txtInfo.setText("Porfavor seleccione solo uno de los dos");
        }
        if(rdbCafeSimple.isSelected()){
            cafe = new CafeSimple();
        } else if (rdbCafeDoble.isSelected()) {
            cafe = new CafeDoble();
        }
        if (rdbLeche.isSelected()){
            cafe = new Leche(cafe);
        }
        if (rdbCaramelo.isSelected()){
            cafe = new Caramelo(cafe);
        }

        mostrarInformacion();
    }

    private void mostrarInformacion(){
        txtInfo.setText("Informacion: " + cafe.descripcion() + "\nCosto: " + cafe.costo());
    }

}