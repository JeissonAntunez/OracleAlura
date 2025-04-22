package Practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Persona persona = new Persona();
//        persona.mostrarInformacion("Jeisson","74996201",22);


        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAltura(20);
        rectangulo.setBase(20);
        rectangulo.getCalcularArea();
        rectangulo.getCalcularPerimetro();

        System.out.println(rectangulo.getCalcularArea());
        System.out.println(rectangulo.getCalcularPerimetro());


        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setTitular("Jeisson");
        cuentaBancaria.depositar(28000);
        cuentaBancaria.retirar(1000);
        cuentaBancaria.verSaldo();


        System.out.println("***********************");
        String word = "quickref";
        for(char c:word.toUpperCase().toCharArray()){
            System.out.print(c + "-");
        }


        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        for(Animal animal : animales){
            animal.hacerSonido();
        }

        System.out.println("**************** \n");

        HashMap<String, String> datos = new HashMap<>();

        datos.put("nombre","King");
        datos.put("cuidad","Lima");
        datos.put("profesion","Programador");

        for(HashMap.Entry<String, String> entrada : datos.entrySet()){
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
        for(String clave: datos.keySet()){
            System.out.println("Clave: " + clave);
        }
        System.out.println("**************** \n");

        List<universidad> personas = new ArrayList<>();
        personas.add(new Estudiante("Jeisson",22,"Ingenieria",4.2));
        personas.add(new Profesor("John", 23,"Matematicas",20000.5));

        for(universidad persona : personas){
            persona.getMostrarDatos();
        }

    }
}
