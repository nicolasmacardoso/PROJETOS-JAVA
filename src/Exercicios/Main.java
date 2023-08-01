package Exercicios;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int y = 17;
        double x = 1.65234423;
        String nome = "Kamilli";
        int idade = 18;
        double renda = 15000.00;

        Locale.setDefault(Locale.US);

        System.out.printf("Olá mundo! Eu tenho " + y + " anos e %.2f metros de altura.%n", x);

        System.out.printf("%s é a minha namorada linda, tem %d anos e ganha R$%.2f",nome, idade, renda);

    }

}
