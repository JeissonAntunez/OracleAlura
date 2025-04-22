package screenmacth_calculos;

import screenmatch.Pelicula;
import screenmatch.Serie;
import screenmatch.Titulo;


public class CalculadoraTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}
