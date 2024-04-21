module co.edu.uniquindio.patronstrategy.pagoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.patronstrategy.pagoapp to javafx.fxml;
    exports co.edu.uniquindio.patronstrategy.pagoapp;

    opens co.edu.uniquindio.patronstrategy.pagoapp.ViewController;
    exports co.edu.uniquindio.patronstrategy.pagoapp.ViewController;

}