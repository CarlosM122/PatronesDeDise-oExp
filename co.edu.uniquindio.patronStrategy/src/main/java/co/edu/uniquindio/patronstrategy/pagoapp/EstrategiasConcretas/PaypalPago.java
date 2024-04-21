package co.edu.uniquindio.patronstrategy.pagoapp.EstrategiasConcretas;

import co.edu.uniquindio.patronstrategy.pagoapp.Interface.StrategyPago;

public class PaypalPago implements StrategyPago {

    private String correo;
    private String contraseña;

    public PaypalPago(String correo, String contraseña){
        this.correo=correo;
        this.contraseña=contraseña;
    }

    @Override
    public String pago(int monto) {
        return monto +", Paga con Paypal";
    }
}
