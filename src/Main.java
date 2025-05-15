import br.com.raffs.listExercises3.Aluno;
import br.com.raffs.listExercises3.Cachorro;
import br.com.raffs.listExercises3.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();
    }
}
