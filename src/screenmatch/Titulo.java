package screenmatch;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private int contador;
    private double sumaDeLasEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    // Concepto de encaplusamiento
    int getContador(){
        return contador;
    }

    double getSumaDeLasEvaluaciones(){
        return sumaDeLasEvaluaciones;
    }
    public void muestraFichaTecnica(){
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);

    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        contador ++;
    }

    public double calculaMedia(){
        return  sumaDeLasEvaluaciones / contador ;
    }
}
