package Exercicios;

public class Ex5_whileContador {

    public static void main(String[] args) {

        double x = 0;

        while (x < 5) {
            double y = x * 3;
            System.out.println(y + " ");
            x = x + 1;
        }

        System.out.println("Fim");
    }
}
