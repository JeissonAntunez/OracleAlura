package screenmatch;

import screenmacth_calculos.CalculadoraTiempo;
import screenmacth_calculos.FiltroRecomendaciones;

public class Principal {
    public static void main(String[] args) {
        Pelicula mipelicula = new Pelicula();
        mipelicula.setNombre("Encato");
        mipelicula.setFechaDeLanzamiento(2021);
        mipelicula.setDuracionEnMinutos(120);

        mipelicula.muestraFichaTecnica();
        mipelicula.evalua(20.0);
        mipelicula.evalua(20.0);
        mipelicula.evalua(20.0);
        mipelicula.evalua(20.0);

        System.out.println(mipelicula.getSumaDeLasEvaluaciones());
        System.out.println(mipelicula.getContador());
        System.out.println(mipelicula.calculaMedia());
        System.out.println("**********************");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());






        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);
        System.out.println();

        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(mipelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());
        System.out.println(calculadora.getTiempoTotal());


        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(mipelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendaciones.filtra(episodio);

    }
}
