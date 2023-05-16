package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        System.out.println("Please enter your number :");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i < nb+1; i++) somme+=i;
        System.out.println(somme);
    }
}
