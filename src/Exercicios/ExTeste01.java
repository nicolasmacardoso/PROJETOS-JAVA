package Exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ExTeste01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<Character, List<String>> nomesPorLetra = new HashMap<>();

        System.out.println("-------ORGANIZADOR DE NOMES-------");
        System.out.print("Digite quantos nomes você deseja exibir: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            char primeiraLetra = nome.charAt(0);

            primeiraLetra = Character.toLowerCase(primeiraLetra);

            nomesPorLetra.computeIfAbsent(primeiraLetra, key -> new ArrayList<>()).add(nome);
        }

        for (char letra = 'a'; letra <= 'z'; letra++) {
            List<String> nomesComLetra = nomesPorLetra.getOrDefault(letra, new ArrayList<>());
            if (!nomesComLetra.isEmpty()) {
                System.out.println("Nomes com a letra " + letra + ": " + nomesComLetra);
            }
        }

        sc.close();
    }
}
