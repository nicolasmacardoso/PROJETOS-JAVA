package ExerciciosPOO.Aplicacoes;

import ExerciciosPOO.Entidade.Ent4_Conta;

import java.util.Scanner;

public class Ex4_Banco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------Banco digital em java------");

        System.out.print("Digite o código da sua conta: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome da sua conta: ");
        String nome = sc.nextLine();

        Ent4_Conta conta = new Ent4_Conta(codigo, nome);

        System.out.print(conta);

        conta.sacar();

        System.out.print(conta);

        conta.depositar();

        System.out.print(conta);

        conta.fecharScanner();
        sc.close();
    }
}
