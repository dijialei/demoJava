package fr.algorithmie;


import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int[] array = new int[1];
        boolean go = true;
        while (go) {
            System.out.println("*************************************");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants.");
            System.out.println("3. Exit");
            System.out.println("Veuillez sélectionner : ");
            Scanner scanner = new Scanner(System.in);
            int nb = scanner.nextInt();
            switch (nb) {
                case 1 -> {
                    System.out.println("Votre nombre : ");
                    array[array.length - 1] = scanner.nextInt();
                    array = Arrays.copyOf(array, array.length + 1);
                }
                case 2 -> {
                    for (int i = 0; i < array.length - 1; i++) {
                        System.out.print(array[i] + "  ");
                    }
                    System.out.println();
                }
                case 3 -> go = false;
                default -> {
                }
            }

        }
    }
}
