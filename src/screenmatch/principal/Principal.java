package screenmatch.principal;

import screenmatch.calculos.CalculadoraDeTiempo;
import screenmatch.calculos.FiltroRecomendacion;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Pelicula;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2019);
        miPelicula.setDuracionEnMinutos(180);
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());


        Serie lost = new Serie("GAME OF TRONS",2020);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la série: " + lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Avatar", 2002);
        otraPelicula.setDuracionEnMinutos(200);
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);




        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);


        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);


        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es:  " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula: "+ listaDePeliculas.get(0).toString());


        /***
           Codigo anterior omitido que nos enseña
          sobre escribir metodos con el toString
           para cambiar la esctrucuta y
          visualizarlo mejor con  datos que deseamos obtener.
          ****/


        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("Tamaño de la lista: " + listaDePeliculas.get(0));


        Object objeto = peliculaDeBruno;




    }
}