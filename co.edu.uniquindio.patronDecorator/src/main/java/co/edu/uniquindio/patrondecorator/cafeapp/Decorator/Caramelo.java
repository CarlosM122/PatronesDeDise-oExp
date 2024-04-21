package co.edu.uniquindio.patrondecorator.cafeapp.Decorator;

import co.edu.uniquindio.patrondecorator.cafeapp.Model.Cafe;

public class Caramelo extends DecoradorCafe{
    public Caramelo(Cafe cafe){
        super(cafe);
    }
    public double costo() {
        return cafe.costo()+600;
    }
    public String descripcion() {
        return cafe.descripcion()+", Caramelo";
    }
}
