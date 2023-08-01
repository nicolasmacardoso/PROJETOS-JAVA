package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex3_Matematica {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x, y, z;
        double A, B, C;
        double soma, raiz;

        System.out.print("Digite o valor de X: ");
        x = sc.nextDouble();

        System.out.print("Digite o valor de Y: ");
        y = sc.nextDouble();

        System.out.print("Digite o valor de Z: ");
        z = sc.nextDouble();

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);

        soma = A + B;
        raiz = Math.sqrt(C);

        System.out.printf("A raiz quadrada de %.0f é aproximadamente %.0f %n", x, A);
        System.out.printf("A soma das raízes quadradas de %.0f e %.0f é aproximadamente %.0f%n", x, y, soma);
        System.out.printf("A raiz quadrada da raiz quadrada de %.0f é aproximadamente %.0f%n", z, raiz);

        A = Math.pow(x, y);
        B = Math.pow(Math.pow(x, 2), 2);
        C = Math.pow(x, -10);
        soma = Math.pow(x, y) + Math.pow(y, z);
        raiz = Math.sqrt(Math.pow(z, y));

        System.out.printf("%.0f elevado a %.0f é aproximadamente %.0f %n", x, y, A);
        System.out.printf("%.0f elevado a -10 é igual a %e %n", x, C);
        System.out.printf("O quadrado do quadrado de %.0f é igual a %.0f %n", x, B);
        System.out.printf("A soma de %.0f elevado a %.0f e %.0f elevado a %.0f é igual a %.0f %n", x, y, y, z, soma);
        System.out.printf("A raiz quadrada de %.0f elevado a %.0f é aproximadamente %.0f%n %n", z, y, raiz);

        sc.close();
    }
}
