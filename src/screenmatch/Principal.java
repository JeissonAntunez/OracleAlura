package screenmatch;

public class Principal {
    public static void main(String[] args) {
        Pelicula mipelicula = new Pelicula();
        mipelicula.nombre = "Encanto";
        mipelicula.fechaDeLanzamiento = 2021;
        mipelicula.duracionEnMinutos = 120;

        mipelicula.muestraFichaTecnica();
        mipelicula.evalua(7.5);
        mipelicula.evalua(6.5);

        System.out.println(mipelicula.sumaDeLasEvaluaciones);
        System.out.println(mipelicula.calculaMedia());
    }
}
