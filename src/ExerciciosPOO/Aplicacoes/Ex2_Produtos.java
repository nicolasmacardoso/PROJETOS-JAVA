package ExerciciosPOO.Aplicacoes;

import ExerciciosPOO.Entidade.Ent2_Produto;

import java.util.Locale;
import java.util.Scanner;

public class Ex2_Produtos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("-----Insira os dados do produto---");
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preço desse produto: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        Ent2_Produto produto = new Ent2_Produto(nome, preco);

        System.out.println(produto);

        produto.adicionarProdutos();

        System.out.printf("      %nDados atualizados %n" + produto);

        produto.removerProdutos();

        System.out.printf("      %nDados atualizados %n" + produto);

        sc.close();
    }
}
