package co.edu.uniquindio.patrondecorator.cafeapp.Model;

public class CafeSimple implements Cafe {
    public double costo(){
        return 1500;
    }

    @Override
    public String descripcion() {
        return "Cafe simple";
    }

}
