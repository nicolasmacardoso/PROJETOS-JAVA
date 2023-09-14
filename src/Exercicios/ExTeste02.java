package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExTeste02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<String> nomes = new ArrayList<>();

        System.out.print("Digite quantos nomes você irá digitar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome: ");
            nomes.add(sc.nextLine());
        }

        for (char letra = 'a'; letra <= 'z'; letra++) {
            char finalLetra = letra;

            String letraM = String.valueOf(letra).toUpperCase();

            List<String> nomesComLetra = nomes.stream()
                    .filter(x -> x.charAt(0) == finalLetra)
                    .toList();

            if (!nomesComLetra.isEmpty()) {
                String nomesFormatados = String.join(", ", nomesComLetra);
                System.out.println("Nomes com a letra "
                        + letraM
                        + "("
                        + nomesComLetra.size()
                        + ")"
                        + ": "
                        + nomesFormatados);
            }
        }

        sc.close();
    }
}
