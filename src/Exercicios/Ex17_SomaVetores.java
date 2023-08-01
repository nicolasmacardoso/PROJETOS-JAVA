package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex17_SomaVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt(); sc.nextLine();

        double[] numeros = new double[n];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ",i + 1);
            numeros[i] = sc.nextDouble(); sc.nextLine();
            soma += numeros[i];
        }

        System.out.print("VALORES = ");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }

        double media = soma / numeros.length;
        System.out.printf("%nSOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }
}
