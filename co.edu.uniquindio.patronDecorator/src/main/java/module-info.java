module co.edu.uniquindio.patrondecorator.cafeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.patrondecorator.cafeapp to javafx.fxml;
    exports co.edu.uniquindio.patrondecorator.cafeapp;

    opens co.edu.uniquindio.patrondecorator.cafeapp.ViewController;
    exports co.edu.uniquindio.patrondecorator.cafeapp.ViewController;
}