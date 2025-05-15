import br.com.raffs.listExercises2.Carro;
import br.com.raffs.listExercises3.IdadePessoa;

public class Main {
    public static void main(String[] args) {
        IdadePessoa teste = new IdadePessoa();
        teste.setIdade(20);
        teste.verificaIdade();
        teste.setIdade(10);
        teste.verificaIdade();
    }
}
