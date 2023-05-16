package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
            System.out.println("Please enter your number :");
            Scanner scanner = new Scanner(System.in);
            int nb = scanner.nextInt();
            for (int i = 1; i < 11; i++) System.out.println(nb + i);

    }
}
