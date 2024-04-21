package co.edu.uniquindio.patronstrategy.pagoapp.Contexto;

import co.edu.uniquindio.patronstrategy.pagoapp.Interface.StrategyPago;

public class CarritoDeCompra {
    private StrategyPago strategyPago;

    public void elegirPago(StrategyPago strategyPago){
        this.strategyPago = strategyPago;
    }

    public String resultado(int monto){
        return strategyPago.pago(monto);
    }
}
