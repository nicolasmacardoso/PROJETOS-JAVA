package ExerciciosPOO.Entidade;

import java.util.Scanner;

public class Ent7_Funcionarios {
    private int id;
    private String nome;
    private double salario;

    Scanner sc = new Scanner(System.in);

    public Ent7_Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public double aumentarSalario() {
        System.out.println("-------AUMENTAR SALÁRIO-------");
        System.out.println("Selecione o aumento em porcentagem do salário do funcionário: ");
        salario += salario * sc.nextInt() / 100;


        return salario;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
