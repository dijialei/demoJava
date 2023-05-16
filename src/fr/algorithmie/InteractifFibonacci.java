package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        System.out.println("Choisir un rang N :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int valueN = 0;
        int value1 = 0;
        int value2 = 1;
        for (int i = 2; i < n; i++) {
            valueN = value1 + value2;
            value1 = value2;
            value2 = valueN;
        }
        System.out.println("Valeur de rang N est :" + valueN);
    }
}
