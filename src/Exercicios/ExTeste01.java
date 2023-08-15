package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExTeste01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList();

        System.out.println("-------ORGANIZADOR DE NOMES-------");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o primeiro nome: ");
            lista.add(sc.nextLine());
        }



        sc.close();
    }
}
