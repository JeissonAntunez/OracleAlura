package radioalura;

public class Audio {

    private String titulo;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }



    public void meGusta(){
        this.totalDeMeGusta++;
        // 199
    }

    public void reproduce(){
        this.totalDeReproducciones++;
        // 999
    }
}
