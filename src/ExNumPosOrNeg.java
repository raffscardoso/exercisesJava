import java.util.Scanner;

public class ExNumPosOrNeg {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numUser = leitor.nextInt();
        if(numUser > 0){
            System.out.println("Numero positivo!");
        } else if (numUser < 0) {
            System.out.println("Numero negativo!");
        }
        System.out.println("Erro na deteccao do numero!");
    }
}
