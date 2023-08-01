package ExerciciosPOO.Aplicacoes;

import ExerciciosPOO.Entidade.Ent1_Triangulo;

import java.util.Scanner;

public class Ex1_Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ent1_Triangulo x, y;

        x = new Ent1_Triangulo();
        y = new Ent1_Triangulo();

        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        x.a = sc.nextDouble();
        System.out.print("Digite o valor do segundo lado do triângulo: ");
        x.b = sc.nextDouble();
        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        x.c = sc.nextDouble();

        double areaX = x.area();

        System.out.print("Digite o valor do primeiro lado do segundo triângulo: ");
        y.a = sc.nextDouble();
        System.out.print("Digite o valor do segundo lado do segundo triângulo: ");
        y.b = sc.nextDouble();
        System.out.print("Digite o valor do terceiro lado do segundo triângulo: ");
        y.c = sc.nextDouble();

        double areaY = y.area();

        double maiorArea = Math.max(areaX, areaY);
        int maiorTriangulo = (areaX > areaY) ? 1 : 2;

        System.out.printf("Área do triângulo 1: %.2f %nÁrea do triângulo 2: %.2f %nMaior área: %.2f (triângulo %d)", areaX, areaY, maiorArea, maiorTriangulo);

        sc.close();
    }
}

