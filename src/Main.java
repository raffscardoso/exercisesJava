import br.com.raffs.listExercises2.Carro;
import br.com.raffs.listExercises3.IdadePessoa;
import br.com.raffs.listExercises3.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(200.00);
        produto.aplicarDesconto(10);
    }
}
