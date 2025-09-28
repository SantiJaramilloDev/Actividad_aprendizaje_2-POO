package modelo;

public abstract class Cuenta {
    protected String numeroCuenta;
    protected double saldo;

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) throws Exception {
        if (saldo < monto) {
            throw new Exception("Saldo insuficiente para realizar el retiro.");
        }
        saldo -= monto;
    }

    @Override
    public String toString() {
        return "Cuenta N° " + numeroCuenta + " | Saldo: $" + saldo;
    }
}
