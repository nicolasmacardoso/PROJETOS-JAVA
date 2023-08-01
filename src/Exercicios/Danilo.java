package Exercicios;

import java.util.*;
class Danilo{

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            int inputLenght = input.length();

            if (input.isEmpty()) {
                System.out.println("true");
            }

            for (int i = 0; i < inputLenght; i++) {
                if (!input.isEmpty()) {
                    char character = input.charAt(0);
                    if (character == '(') {
                        if (canFormPair(input, character)) {
                            input = removePair(input, character);
                        }
                    }
                    if (character == '[') {
                        if (canFormPair(input, character)) {
                            input = removePair(input, character);
                        }
                    }
                    if (character == '{') {
                        if (canFormPair(input, character)) {
                            input = removePair(input, character);
                        }
                    }
                }
                else break;
            }
            if (input.isEmpty()) System.out.println("true");
            else System.out.println("false");
        }
    }

    public static boolean canFormPair(String s, char c) {
        if (c == '(') c = ')';
        if (c == '[') c = ']';
        if (c == '{') c = '}';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) return true;
        }
        return false;
    }

    public static String removePair(String s, char c) {
        StringBuilder sb = new StringBuilder(s);
        if (c == '(') {
            sb.deleteCharAt(sb.indexOf("("));
            sb.deleteCharAt(sb.indexOf(")"));
        }
        if (c == '[') {
            sb.deleteCharAt(sb.indexOf("["));
            sb.deleteCharAt(sb.indexOf("]"));
        }
        if (c == '{') {
            sb.deleteCharAt(sb.indexOf("{"));
            sb.deleteCharAt(sb.indexOf("}"));
        }
        return sb.toString();
    }
}