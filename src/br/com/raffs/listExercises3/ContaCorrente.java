package br.com.raffs.listExercises3;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal(){
        double tarifa = 0.05;
        double desconto = (this.saldo / 100) * tarifa;
        saldo -= desconto;
    }
}
