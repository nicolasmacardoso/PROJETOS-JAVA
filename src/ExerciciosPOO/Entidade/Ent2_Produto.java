package ExerciciosPOO.Entidade;

import java.util.Scanner;

public class Ent2_Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private final Scanner sc = new Scanner(System.in);

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public Ent2_Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Ent2_Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void adicionarProdutos() {
        System.out.printf("%nQuantos produtos você deseja adicionar: ");
        quantidade += sc.nextInt();
    }
    public void removerProdutos() {
        System.out.printf("%n%nQuantos produtos você deseja remover: ");
        quantidade -= sc.nextInt();
    }
    public double valorEstoque() {
        return preco*quantidade;
    }
    public String toString() {
        return  "Nome do produto: " + nome + String.format("%n")
                + "Preço do produto: " + String.format("%.2f", preco) + String.format("%n")
                + "Quantidade do produto: " + quantidade + String.format("%n")
                + "Valor total do estoque: " + String.format("%.2f", valorEstoque());
    }
}
