import java.util.Random;
import java.util.Scanner;

public class Desafio_Adivinacion {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100) + 1; // de 1 a 100 (no de 0 a 99)

        System.out.println("Intente adivinar un número del 1 al 100. Tiene 5 intentos.");

        for (int contador = 1; contador <= 5; contador++) {
            System.out.print("Intento #" + contador + ": ");
            int datoLectura = lectura.nextInt();

            if (datoLectura == aleatorio) {
                System.out.println(" ¡Ganaste! Adivinaste el número %d en el intento %d."
                        .formatted(aleatorio, contador));
                break;
            } else {
                System.out.println(" No adivinaste.");
                if (contador == 5) {
                    System.out.println(" Perdiste. El número correcto era: " + aleatorio);
                }
            }
        }

        lectura.close();
    }

}



