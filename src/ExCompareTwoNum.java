import java.util.Scanner;

public class ExCompareTwoNum {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Insira o numero 1:");
        num1 = leitor.nextInt();
        System.out.println("Insira o numero 2:");
        num2 = leitor.nextInt();

        if(num1 == num2){
            System.out.println("Os numeros sao iguais!");
        } else System.out.println("Os numeros sao diferentes!");

        if (num1 > num2) {
            System.out.println("O numero 1 e maior que o numero 2");
        } else System.out.println("O numero 1 e menor que o numero 2");

    }
}
