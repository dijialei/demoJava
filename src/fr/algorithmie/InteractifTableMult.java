package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        boolean go = true;
        while (go) {
            System.out.println("Please enter your number :");
            Scanner scanner = new Scanner(System.in);
            int nb = scanner.nextInt();
            if ( nb > 1 && nb < 10) {
                for (int i = 1; i < 11; i++) {
                    System.out.println(nb + "*" + i + "=" + nb * i);
                }
                go = false;
            }
        }
    }
}
