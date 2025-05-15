import br.com.raffs.listExercises2.Carro;
import br.com.raffs.listExercises3.Aluno;
import br.com.raffs.listExercises3.IdadePessoa;
import br.com.raffs.listExercises3.Produto;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNota1(10);
        aluno.setNota2(8);
        aluno.setNota3(3);
        aluno.calculaMedia();
    }
}
