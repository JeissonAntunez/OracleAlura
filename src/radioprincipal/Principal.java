package radioprincipal;

import radioalura.Cancion;
import radioalura.MisFavoritos;
import radioalura.Podcast;

public class Principal {

    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");

        // cancion
        for( int i =0; i < 100; i++){
            miCancion.meGusta();
        }
        for (int i =0; i < 15000; i++){
            miCancion.reproduce();
        }

        // Podcast
        for( int i =0; i < 200; i++){
            miPodcast.meGusta();
        }
        for (int i =0; i < 1000; i++){
            miPodcast.reproduce();
        }

        System.out.println(miCancion.getTotalDeReproducciones());
        System.out.println(miCancion.getTotalDeMeGusta());


        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
//        favoritos.adicione(miCancion);
    }
}
