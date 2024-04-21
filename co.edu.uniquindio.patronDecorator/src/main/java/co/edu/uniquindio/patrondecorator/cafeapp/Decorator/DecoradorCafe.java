package co.edu.uniquindio.patrondecorator.cafeapp.Decorator;

import co.edu.uniquindio.patrondecorator.cafeapp.Model.Cafe;

abstract class DecoradorCafe implements Cafe {

    protected Cafe cafe;

    public DecoradorCafe(Cafe cafe){
        this.cafe = cafe;
    }

    public double costo(){
        return cafe.costo();
    }

    public String descripcion(){
        return cafe.descripcion();
    }
}
