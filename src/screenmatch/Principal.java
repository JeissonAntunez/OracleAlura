package screenmatch;

public class Principal {
    public static void main(String[] args) {
        Pelicula mipelicula = new Pelicula();
        mipelicula.setNombre("Encato");
        mipelicula.setFechaDeLanzamiento(2021);
        mipelicula.setDuracionEnMinutos(120);

        mipelicula.muestraFichaTecnica();
        mipelicula.evalua(7.5);
        mipelicula.evalua(6.5);
        mipelicula.evalua(7.8);

        System.out.println(mipelicula.getSumaDeLasEvaluaciones());
        System.out.println(mipelicula.getContador());
        System.out.println(mipelicula.calculaMedia());
        System.out.println("**********************");


    }
}
