package br.com.raffs.listExercises3;

public class IdadePessoa {
    private int idade;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade(){
        if(this.idade > 18){
            System.out.println("Maior de Idade!");
        } else System.out.println("Menor de Idade!");
    }
}
