package ExerciciosPOO.Aplicacoes;

import ExerciciosPOO.Entidade.Ent6_Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Ex6_Pensionato {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("-----SISTEMA DE ALUGUÉIS-----\n" +
                "Digite quantos quartos serão alugados: ");
        int n = sc.nextInt();
        sc.nextLine();

        Ent6_Estudante[] estudante = new Ent6_Estudante[10];

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "º MEMBRO\n" +
                    "Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            int quarto;
            do {
                System.out.print("Quarto (0 a 9): ");
                quarto = sc.nextInt();
                sc.nextLine();
            } while (quarto < 0 || quarto > 9 || estudante[quarto] != null);
            estudante[quarto] = new Ent6_Estudante(nome, email);
        }

        System.out.println("----QUARTOS OCUPADOS----");
        for (int i = 1; i < 10; i++) {
            if (estudante[i] != null) {
                System.out.println(i + ": " + estudante[i]);
            }
        }

        sc.close();
    }
}
