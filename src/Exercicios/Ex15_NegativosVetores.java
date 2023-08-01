package Exercicios;

import java.util.Scanner;

public class Ex15_NegativosVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do {
            System.out.printf("Quantos números você vai digitar?(Máximo 10) %n" +
                                "Digite aqui: ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n > 10);

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0) {
                System.out.print(" " + numeros[i]);
            }
        }

        sc.close();
    }
}
