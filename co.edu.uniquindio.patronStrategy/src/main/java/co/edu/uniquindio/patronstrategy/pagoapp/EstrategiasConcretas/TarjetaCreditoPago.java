package co.edu.uniquindio.patronstrategy.pagoapp.EstrategiasConcretas;

import co.edu.uniquindio.patronstrategy.pagoapp.Interface.StrategyPago;

public class TarjetaCreditoPago implements StrategyPago {
    private String numTarjeta;
    private String fechaVencimiento;
    private String cvv;

    public TarjetaCreditoPago(String numTarjeta, String fechaVencimiento, String cvv) {
        this.numTarjeta = numTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    @Override
    public String pago(int monto) {
        int credito= 1000000;
        int creditoRestante= credito-monto;
        return monto +", Pagado con tajeta de credito\nSu credito actual es de: " + creditoRestante;
    }
}
