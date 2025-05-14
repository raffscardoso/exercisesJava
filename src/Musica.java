import java.util.Scanner;

public class Musica {
   String titulo;
   String artista;
   int anoLancamento;
   double avaliacao;
   int numAvaliacoes;
   double somaDasAvaliacoes;

   void exibeFicha(){
       System.out.println(titulo + " " + artista + " " + anoLancamento + " " + avaliacao + " " + numAvaliacoes);
   }
   void avaliaMusica(){
       Scanner leitor = new Scanner(System.in);
       System.out.println("Qual a sua avaliacao?");
       avaliacao = leitor.nextDouble();
       if(avaliacao < 0){
           System.out.println("Insira um numero positivo!");
       }
       somaDasAvaliacoes += avaliacao;
       numAvaliacoes++;
   }

   void calculaMedia(){
       double media = somaDasAvaliacoes/ numAvaliacoes;
       System.out.println("A media das avaliacoes e: " + media);
   }
}
