package binarios;

import java.util.Scanner;

public class Binarios {

    public static int bin(int num) {
        if (num < 0x2) {
            System.out.print(num);
        } else {
            bin(num / 2);
            System.out.print(num % 2);
        }
        return 0;
    }

    public static void main(String[] args) {
        int bin;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int enter = entrada.nextInt();
        System.out.print("el binario es: ");
        bin = bin(enter);
        System.out.println("");
    }
}
