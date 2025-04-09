public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Wo3rld!");


        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fué lanzada
                """;

        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        String nombra = "Juan";
        int aulas = 4;

        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombra, aulas);

        System.out.println(mensaje);


        // El casting es  un recurso para convertir un tipo de dato en otro.

        System.out.println("Casting Implícito \n ");
        int x = 10;
        double y = x;

        System.out.println("Casting Explícito \n ");

        double z = 20.5;
        int k = (int) z;
        System.out.println(k);

        System.out.println(" \n ");
        String saludo = "Hola, mi nombre es ";
        String nombrar = "Alicia ";
        String continuacion = "y mi edad es ";
        int edads = 17;

        System.out.printf("%s %s %s %d".formatted(saludo,nombrar,continuacion,edads));

    }


}