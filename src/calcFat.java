import java.util.Scanner;

public class calcFat {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero para o calculo do fatorial: ");
        int numUser = leitor.nextInt();

        for (int i = numUser - 1; i != 0; i--){
            numUser *= i;
        }
        System.out.println("O resultado e: " + numUser);
    }
}
