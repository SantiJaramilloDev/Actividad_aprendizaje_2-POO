package transacciones;

import modelo.Cuenta;

public class Deposito implements Transaccion {
    private Cuenta cuenta;
    private double monto;

    public Deposito(Cuenta cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        cuenta.depositar(monto);
        System.out.println("Depósito de $" + monto + " realizado en la cuenta " + cuenta.getNumeroCuenta());
    }

    @Override
    public double getMonto() {
        return monto;
    }
}
