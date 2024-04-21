package co.edu.uniquindio.patrondecorator.cafeapp.Model;

public class CafeDoble implements Cafe{

    public double costo() {
        return 2000;
    }

    public String descripcion() {
        return "Cafe doble";
    }
}
