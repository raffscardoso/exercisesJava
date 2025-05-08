import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        int numAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;

        while(tentativas < 5){
            System.out.println("Qual o numero secreto?");
            int numUser = leitura.nextInt();


            if(numUser == numAleatorio){
                System.out.println("Numero correto!");
                break;
            } else if (numUser < numAleatorio) {
                System.out.println("O numero digitado e menor que o numero aleatorio!");
            }else {
                System.out.println("O numero digitado e maior que o numero secreto!");
            }

            System.out.println("Voce falhou! O numero secreto era: " + numAleatorio);
            tentativas++;
        }
    }
}
