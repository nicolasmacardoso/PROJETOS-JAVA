package Exercicios;

import java.util.Scanner;

public class Ex9_bitwise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b100000; //32
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6º bit é verdadeiro!");
        }

        else {
            System.out.println("6º é verdadeiro");
        }

        sc.close();
    }
}
