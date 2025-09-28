package transacciones;

import modelo.Cuenta;

public class Retiro implements Transaccion {
    private Cuenta cuenta;
    private double monto;

    public Retiro(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void ejecutar() throws Exception {
        cuenta.retirar(monto);
        System.out.println("Retiro de $" + monto + " realizado en la cuenta " + cuenta.getNumeroCuenta());
    }

    @Override
    public double getMonto() {
        return monto;
    }
}
