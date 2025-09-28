package app;

import modelo.*;
import transacciones.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cooperativa coop = new Cooperativa();

        // Crear sociosl
        Socio s1 = new Socio("Ana Pérez", "123");
        Socio s2 = new Socio("Carlos López", "456");

        coop.registrarSocio(s1);
        coop.registrarSocio(s2);

        try {
            // Abrir cuentas
            CuentaAhorros c1 = new CuentaAhorros("A001", 0.02);
            CuentaAhorros c2 = new CuentaAhorros("A002", 0.03);

            s1.agregarCuenta(c1);
            s2.agregarCuenta(c2);

            // Operaciones
            Transaccion dep1 = new Deposito(c1, 1000000);
            dep1.ejecutar();

            Transaccion ret1 = new Retiro(c1, 200000);
            ret1.ejecutar();

            // Aplicar interés
            c1.aplicarInteres();
            c2.aplicarInteres();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Programación funcional
        System.out.println("\n--- Socios registrados ---");
        coop.getSocios().stream()
                .map(Socio::getNombre)
                .forEach(System.out::println);

        System.out.println("\n--- Cuentas con saldo mayor a $500000 ---");
        coop.getSocios().stream()
                .flatMap(s -> s.getCuentas().stream())
                .filter(c -> c.getSaldo() > 500000)
                .forEach(System.out::println);

        System.out.println("\n--- Total de dinero en la cooperativa ---");
        double total = coop.getSocios().stream()
                .flatMap(s -> s.getCuentas().stream())
                .map(Cuenta::getSaldo)
                .reduce(0.0, Double::sum);

        System.out.println("Total: $" + total);
    }
}
