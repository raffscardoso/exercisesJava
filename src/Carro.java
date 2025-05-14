import java.time.LocalDate;

public class Carro {
    String modelo;
    int anoCarro;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de lancamento: " + anoCarro);
        System.out.println("Cor do carro: " + cor);
    }

    void calculaIdadeCarro(){
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int idadeCarro = anoAtual - anoCarro;
        System.out.println("Idade do carro: " + idadeCarro + " anos");
    }
}
