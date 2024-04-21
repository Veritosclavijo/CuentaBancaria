public class Main {


    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(123,15000.00,"Verónica Clavijo","Cuenta de Ahorros");
        cuenta1.informacionCuenta();
        cuenta1.retirarSaldo(5000.00);

        System.out.println("Nuevo saldo después del retiro: " + cuenta1.getSaldoFinal());

        CuentaBancaria cuenta2 = new CuentaBancaria(456,20000.00,"Daniel Bernal","Cuenta Corriente");
        cuenta2.informacionCuenta();
        cuenta2.retirarSaldo(15000.00);
        System.out.println("Nuevo saldo después del retiro: " + cuenta2.getSaldoFinal());

        System.out.println();

    }
}