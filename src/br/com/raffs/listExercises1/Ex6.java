package br.com.raffs.listExercises1;

public class Ex6 {
    public static void main(String[] args) {
        double precoOriginal = 99.90;
        double percentualDesconto = 10.00;

        double desconto = (precoOriginal/100) * percentualDesconto;
        precoOriginal -= desconto;

        System.out.println("Novo preco com desconto:" + precoOriginal);

    }
}
