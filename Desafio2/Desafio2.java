package Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        System.out.println("Digite os valores");
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.println("O número é ímpar");
            }
    
        sc.close();
    }
}
