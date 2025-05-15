package br.com.raffs.listExercises2;

import java.util.Scanner;

public class tabuadaNum {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero base para tabuada:");
        int numUser = leitor.nextInt();
        for (int i = 1; i <= 10; i++){
            int produto = numUser * i;
            System.out.printf("%d x %d = %d\n",numUser,i,produto);
        }
    }
}
