package Exercicios;

public class Ex16_ForEach {
    public static void main(String[] args) {

        String[] vetor = new String[] {"Maria", "Fdp", "Bosta"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        for (String s : vetor) {
            System.out.println(s);
        }
    }
}
