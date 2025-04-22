package Practica;

public class CuentaBancaria implements Cuenta {

    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
// Constructor

    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public CuentaBancaria() {

    }


    @Override
    public void depositar(double cantidad) {
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Se deposito: S/ " + cantidad);
        } else {
            System.out.println("Cantidad inválida para depositar");
        }
    }

    @Override
    public void retirar(double cantidad) {
    if(cantidad > 0 && cantidad <= saldo){
        saldo -= cantidad;
        System.out.println("Se retiro: S/ "+ cantidad);
    }else {
        System.out.println("No se  puede retirar esa cantidad. Saldo Insuficiente");
    }
    }

    @Override
    public void verSaldo() {
        System.out.println("Saldo actual de " + titular+ ": S/ " + saldo);
    }
}
