package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
//        Animal miMascota = new Perro();
////       miMascota.hacerSonido();
////      miMascota = new Gato();
////       miMascota.hacerSonido();

        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal animal : animales){
            animal.hacerSonido();
        }

    }
}
