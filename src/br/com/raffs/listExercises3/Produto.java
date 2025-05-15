package br.com.raffs.listExercises3;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int porcentagem){
        System.out.println("Preco sem desconto: " + this.preco);
        double desconto = (this.preco / 100) * porcentagem;
        this.preco -= desconto;
        System.out.println("Preco com desconto: " + this.preco);
    }
}
