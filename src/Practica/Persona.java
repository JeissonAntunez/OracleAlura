package Practica;

public class Persona {
    protected String nombre, dni;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion(String dato1, String dato2,int dato3){
        System.out.println("Mi nombre es : " + dato1 + " \n" + "Mi dni es : " + dato2 + " \n" + "Mi dni es : " + dato3 );
    }

    public void mostrarPersona(){
        System.out.println("Mi nombre es : " + nombre + "\n" + "Mi edad es : " + edad +"\n");
    }
}
