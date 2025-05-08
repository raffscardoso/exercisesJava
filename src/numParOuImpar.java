import java.util.Scanner;

public class numParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se e par ou impar: ");
        int numUser = leitor.nextInt();

        if(numUser%2 != 0){
            System.out.println("O numero digitado e impar!");
        } else System.out.println("O resultado e par!");
    }

}
