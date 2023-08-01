package Exercicios;

import java.util.Scanner;

public class Ex13_funcoesTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor do segundo lado do triângulo: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        c = sc.nextDouble();

        double p = (a + b + c)/2;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        double a2, b2, c2;

        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        a2 = sc.nextDouble();
        System.out.print("Digite o valor do segundo lado do triângulo: ");
        b2 = sc.nextDouble();
        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        c2 = sc.nextDouble();

        double p2 = (a2 + b2 + c2)/2;

        double area2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

        double maiorArea = Math.max(area, area2);

        int maiorTriangulo = (area > area2) ? 1 : 2;

        System.out.printf("Área do triângulo 1: %.2f %nÁrea do triângulo 2: %.2f %nMaior área: %.2f(triângulo %d)", area, area2, maiorArea, maiorTriangulo);

        sc.close();
    }
}