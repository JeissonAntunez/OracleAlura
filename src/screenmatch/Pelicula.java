package screenmatch;

public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    int contador;
    double sumaDeLasEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);

    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        contador ++;
    }

    double calculaMedia(){
        return  sumaDeLasEvaluaciones / contador ;
    }
}

