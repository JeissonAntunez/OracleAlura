package practic;

public class Aprobacion {
    private double nota;
    private int contador ;
    private double nota2;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
         this.nota += nota;
        contador++;
    }

    public void promedio(){
        this.nota2 =  nota / contador;
        if(nota2 >= 7.0){
            System.out.println("El estudiante es aprobado, su nota final es :  %.2f".formatted(nota2));
        } else if(nota2 >= 5.0 && nota2 <= 6.9){
            System.out.println("El estudiante está en recuperación, su nota final es : %.2f ".formatted(nota2));
        } else{
            System.out.println("El estudiante fue reprobado, su nota final es :  %.2f".formatted(nota2));
        }
    }
}
