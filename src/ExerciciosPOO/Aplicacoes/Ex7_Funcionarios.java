package ExerciciosPOO.Aplicacoes;

import ExerciciosPOO.Entidade.Ent7_Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex7_Funcionarios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Ent7_Funcionarios> Funcionarios = new ArrayList<>();

        System.out.print("Digite quantos empregados você irá cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n ; i++) {
            System.out.println("--------DADOS DO FUNCIONÁRIO--------");

            System.out.print("ID: ");
            int id = sc.nextInt(); sc.nextLine();

            boolean idExistente = false;
            for (Ent7_Funcionarios funcionarioExistente : Funcionarios) {
                if (funcionarioExistente.getId() == id) {
                    idExistente = true;
                    break;
                }
            }

            if (idExistente) {
                System.out.println("Já existe um funcionário com esse ID. Digite outro ID.");
                continue;
            }

            System.out.print("Nome: ");
            String nome = sc.next(); sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble(); sc.nextLine();

            Ent7_Funcionarios funcionario = new Ent7_Funcionarios(id,nome,salario);
            Funcionarios.add(funcionario);
        }

        System.out.print("Insira o ID do funcionário que irá receber o aumento salarial: ");
        int idSalario = sc.nextInt();
        Integer posicao = posicaoId(Funcionarios, idSalario);
        do {
            System.out.print("Id inválido, digite novamente: ");
            idSalario = sc.nextInt();
            posicao = posicaoId(Funcionarios, idSalario);
        } while (posicao == null);

        System.out.print("Digite a porcentagem do aumento: ");
        int percentual = sc.nextInt();


        sc.close();
    }

    static Integer posicaoId(List<Ent7_Funcionarios> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
