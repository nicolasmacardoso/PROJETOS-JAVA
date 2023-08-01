package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex6_AlturasVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                -------Calculadora de alturas--------
                Deseja cadastrar a altura de quantas pessoas?
                Digite aqui:\s""");
        int n = sc.nextInt();
        sc.nextLine();

        double[] alturas = new double[n];
        int[] idades = new int[n];
        String[] nomes = new String[n];

        double media, percentual, soma = 0;
        int nMenores = 0;

        int i;
        for (i = 0; i < n; i++) {
            System.out.printf("----Digite os dados do %dº indivíduo----%n" +
                    "Nome: ", i + 1);
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();

            if (idades[i] < 16) {
                nMenores += 1;
            }

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine();
            soma += alturas[i];
        }

        media = soma / alturas.length;

        percentual = (double) nMenores/idades.length * 100.0;

        System.out.printf("Altura média das %d pessoas: %.2f\n", n, media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", percentual);
        System.out.println();
        System.out.print("----Lista de menores de 16----");

        for (i = 0; i<n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%n%s, %d anos.",nomes[i],idades[i]);
            }
        }

        sc.close();
    }
}
