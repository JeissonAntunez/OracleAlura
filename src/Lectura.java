import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento ");
        String fechaDeLanzamiento = teclado.nextLine();
        System.out.println("Tu película favorita es %s y su fecha de lanzamiento fue %s".formatted(pelicula,fechaDeLanzamiento) );

    }
}
