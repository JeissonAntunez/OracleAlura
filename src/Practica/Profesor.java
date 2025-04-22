package Practica;

public class Profesor extends Persona implements  universidad{

    private String especialidad;
    private double sueldo;

    public  Profesor(String nombre, int edad, String especialidad, double sueldo){
        super(nombre,edad);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public Profesor() {

    }


    @Override
    public void getMostrarDatos() {

        mostrarPersona();
        System.out.println("Mi especialidad es " + especialidad);
        System.out.println("Mi sueldo es " + sueldo);
    }


}
