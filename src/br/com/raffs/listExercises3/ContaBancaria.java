package br.com.raffs.listExercises3;

public class ContaBancaria {
    private int numeroConta;
    protected double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Numero invalido!");
            return;
        }
        saldo -= valor;
    }

    public void depositar(double valor){
        if (valor < 0){
            System.out.println("Valor invalido!");
            return;
        }
        saldo += valor;
    }
}
