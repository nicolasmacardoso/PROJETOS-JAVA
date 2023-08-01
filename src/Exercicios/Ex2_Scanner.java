package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2_Scanner {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char w;

        x = sc.nextLine();
        y = sc.nextInt();
        sc.nextLine();
        z = sc.nextDouble();
        sc.nextLine();
        w = sc.next().charAt(0);
        System.out.println("Dados digitados: ");
        System.out.printf(x + " " + y  + " " + z + " " + w);

        sc.close();
    }
}
