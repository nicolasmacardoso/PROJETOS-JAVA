package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex14_vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Calculador de média de alturas------");
        System.out.print("Digite quantas pessoas você deseja informar a altura: ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];
        double soma = 0, media = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a altura da %dº pessoa: ", i + 1);
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        media = soma/n;

        System.out.printf("Média das %d alturas: %.2f", n, media);

        sc.close();
    }
}
