public class Main{
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CUENTAS BANCARIAS ===");

        System.out.println("\n--- Cuenta de Ahorros ---");
        CuentaAhorros cuentaAhorros = new CuentaAhorros(2500, 5, true);
        System.out.println("Cuenta creada");
        cuentaAhorros.imprimir();

        System.out.println("Consignando 500...");
        cuentaAhorros.consignar(500);
        cuentaAhorros.imprimir();

        System.out.println("Retirando 1000...");
        cuentaAhorros.retirar(1000);
        cuentaAhorros.imprimir();

        System.out.println("Extacto mensual...");
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

    }
}