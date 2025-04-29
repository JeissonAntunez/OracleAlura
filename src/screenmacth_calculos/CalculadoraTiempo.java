package screenmacth_calculos;

import screenmatch.modelos.Pelicula;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;


public class CalculadoraTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}
