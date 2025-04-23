package Practica;

public class Circulo implements  Figura{

    private double pi = Math.PI;
    private double area = Math.pow(pi,2);


    @Override
    public void calcularArea() {
        System.out.println(String.format("Área del círculo: %.2f", area));
    }
}
