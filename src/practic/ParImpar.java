package practic;

import java.util.Scanner;

public class ParImpar {

    private double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
        if(numero % 2 == 0){
            System.out.println("Es un número par");
        } else {
            System.out.println("Es un número impar");
        }
    }
}
