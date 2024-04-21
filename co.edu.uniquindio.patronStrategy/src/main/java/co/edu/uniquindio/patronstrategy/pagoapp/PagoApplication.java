package co.edu.uniquindio.patronstrategy.pagoapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PagoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PagoApplication.class.getResource("PagoView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pago");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}