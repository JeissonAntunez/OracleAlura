package practic;

import java.util.Scanner;

public class Contra {

    private Scanner scanner = new Scanner(System.in);
    private String contra;
    private String interno = "12345";
    private int contador;

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void validar() {
        while (true) {
            System.out.print("Ingrese su contraseña: ");
            contra = scanner.nextLine(); // Aquí pedimos al usuario la contraseña

            if (contra.equals(interno)) {
                System.out.println("✅ Contraseña correcta");
                break;
            } else {
                System.out.println("❌ Contraseña incorrecta. Intente de nuevo por favor.");
                contador++;
            }
        }
        System.out.println("Intentos: " + contador);
    }
}
