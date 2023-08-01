package Exercicios;

import java.util.Locale;

public class Ex1_Estrutura {

    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";


        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        float preco2 = 650f;
        double medir = 53.234567;

        System.out.printf("Produtos:%n"
                + "%s, no qual o preço é de R$%.2f %n"
                + "%s, no qual o preço é de R$%.2f %n"
                + "%n"
                + "Dados: %d anos de idade, codigo %d e gênero: %s%n"
                + "%n"
                + "Medida com oito casas decimais: %f%n"
                + "Arredondado (três casas decimais: %.3f%n", produto1, preco1, produto2, preco2, idade, codigo, genero, medir, medir);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f", medir);
    }

}
