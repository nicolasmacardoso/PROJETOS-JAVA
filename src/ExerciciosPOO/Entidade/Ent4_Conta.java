package ExerciciosPOO.Entidade;

import java.util.Scanner;

public class Ent4_Conta {
    private int codigo;
    private String nome;
    private double montante;

    private final Scanner sc = new Scanner(System.in);

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMontante() {
        return montante;
    }

    public Ent4_Conta(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        depositoInicial();
    }

    public void depositoInicial() {
        System.out.print("Deseja fazer um depósito inicial? [S/N]: ");
        char resp = sc.next().charAt(0);
        if (resp != 'n') {
            depositar();
        }
    }

    public void sacar() {
        System.out.printf("Digite a quantia que você deseja sacar: %n----R$ ");
        montante -= 5 + sc.nextDouble();
    }

    public void depositar() {
        System.out.printf("Digite a quantia que você deseja depositar: %n----R$ ");
        montante += sc.nextDouble();
    }

    public String toString() {
        return "------Dados da sua conta----" + String.format("%n")
                + "Código: " + codigo + String.format("%n")
                + "Nome: " + nome + String.format("%n")
                + "Montante: R$ " + String.format("%.2f", montante) + String.format("%n");
    }

    public void fecharScanner() {
        this.sc.close();
    }
}
