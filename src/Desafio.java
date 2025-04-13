




import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        System.out.println("************************** \n");
        final String nombre = "Tony Stark";
        final String cuenta = "Corriente";
        double saldo = 1599.99;

        Scanner input = new Scanner(System.in);
        int dato = 0;

        while (dato != 4) {
            System.out.println("Nombre del cliente: %s \nTipo de cuenta: %s \nSaldo disponible: %.2f \n"
                    .formatted(nombre, cuenta, saldo));

            System.out.println("""
                    **********************************************
                    ** Escribe el número de la opción deseada ** 
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    4 - Salir
                    """);

            System.out.print("Opción: ");
            dato = input.nextInt();

            if (dato == 1) {
                System.out.println("Tu saldo es: %.2f".formatted(saldo));

            } else if (dato == 2) {
                System.out.print("Ingrese la cantidad a retirar: ");
                double retiro = input.nextDouble();
                if (retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Saldo actual: %.2f".formatted(saldo));
                } else {
                    System.out.println("Fondos insuficientes.");
                }

            } else if (dato == 3) {
                System.out.print("Ingrese la cantidad a depositar: ");
                double deposito = input.nextDouble();
                saldo += deposito;
                System.out.println("Depósito exitoso. Saldo actual: %.2f".formatted(saldo));

            } else if (dato == 4) {
                System.out.println("Saliendo del sistema. ¡Hasta luego, King!");

            } else {
                System.out.println("Opción no válida.");
            }

            // Agrega una pausa opcional entre operaciones
            System.out.println("\nPresiona Enter para continuar...");
            input.nextLine(); // limpiar buffer
            input.nextLine(); // esperar Enter
        }

        input.close();
    }
}
