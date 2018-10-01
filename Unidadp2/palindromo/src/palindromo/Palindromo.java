package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static boolean palab(String palabra) {
        if (palabra.length() <= 1) {
            return true;
        } else {
            if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
                return palab(palabra.substring(1, palabra.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        String frace;

        System.out.println("Ingresa una palabra:  ");
        frace = x.nextLine();
        frace = frace.replace(" ", "");

        if (palab(frace) == true) {
            System.out.println("La palabra o frase; " + frace + " es un palindromo");
        } else {
            System.out.println("La palabra o frase; " + frace + " no es un palindromo");
        }

    }

}
