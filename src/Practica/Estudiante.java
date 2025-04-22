package Practica;

import java.security.interfaces.EdECKey;

public class Estudiante extends Persona implements  universidad {

    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio){
        super(nombre,edad);
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Estudiante() {
        super();
    }


    @Override
    public void getMostrarDatos() {

        mostrarPersona();
        System.out.println("Mi carrera es " + carrera);
        System.out.println("Mi promedio es " + promedio);
    }


}
