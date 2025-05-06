package screenmatch.principal;

import screenmatch.modelos.Pelicula;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2019);
        Pelicula otraPelicula = new Pelicula("Avatar", 2002);
        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        Serie lost = new Serie("GAME OF TRONS",2020);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(lost);


       for (Titulo item: lista){
           System.out.println(item);
           System.out.println(item.toString());
       }


    }
}
