package ExerciciosPOO.Aplicacoes;

import ExerciciosPOO.Util.Util3_Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Ex3_Calculos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o raio: ");

        double raio = sc.nextDouble();
        double c = Util3_Calculator.circunferencia(raio);
        double v = Util3_Calculator.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Util3_Calculator.PI);
    }
}
