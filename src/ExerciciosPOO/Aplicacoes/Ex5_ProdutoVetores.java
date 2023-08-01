package ExerciciosPOO.Aplicacoes;

import ExerciciosPOO.Entidade.Ent5_Produto;

import java.util.Locale;
import java.util.Scanner;

public class Ex5_ProdutoVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("-------Calculadora de preços de produtos-----------" +
                            "%nVocê deseja calcular a média de quantos produtos?%n" +
                            "Digite aqui: ");
        int n = sc.nextInt();
        sc.nextLine();

        double soma=0.0, media=0.0;

        Ent5_Produto[] vetor = new Ent5_Produto[n];

        for (int i=0; i<vetor.length; i++) {
            System.out.printf("-----Digite os dados do produto %d-----%n" +
                                "Nome: ", i+1);
            String nome = sc.nextLine();

            System.out.printf("Preço: R$ ");
            double preco = sc.nextDouble();
            sc.nextLine();

            vetor[i] = new Ent5_Produto(nome, preco);

            soma += vetor[i].getPreco();
        }

        media = soma/vetor.length;

        System.out.printf("A média dos preços dos %d produtos resulta em R$ %.2f",n,media);

        sc.close();
    }
}
