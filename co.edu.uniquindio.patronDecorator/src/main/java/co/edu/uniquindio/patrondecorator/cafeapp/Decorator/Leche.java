package co.edu.uniquindio.patrondecorator.cafeapp.Decorator;

import co.edu.uniquindio.patrondecorator.cafeapp.Model.Cafe;

public class Leche extends DecoradorCafe {

    public Leche (Cafe cafe){
        super(cafe);
    }

    public double costo(){
        return cafe.costo()+700;
    }

    public String descripcion(){
        return cafe.descripcion()+", Leche";
    }
}