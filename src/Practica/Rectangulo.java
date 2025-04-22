package Practica;

public class Rectangulo  implements  metodos{

    private double base, altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getCalcularArea() {
        return  base * altura;
    }

    @Override
    public double getCalcularPerimetro() {
        return getCalcularArea() * 2;
    }
}
