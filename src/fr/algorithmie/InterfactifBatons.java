package fr.algorithmie;

import java.util.Scanner;

public class InterfactifBatons {
    /*
     * Pour tester:
     * Veuillez choisir combien de bâtons Max. par tirage:  4
     * Voulez - vous tirer en premier(y/n):  y
     * Vous Avez perdu !
     *
     *
     *
     * Veuillez choisir combien de bâtons Max. par tirage:  4
     * Voulez - vous tirer en premier(y/n):  n
     * Tirer 5 - N bâtons par tirage, N est le nombre de bâtons tirés en dernier fois par ordinateur
     * Vous Avez gagné !
     *
     * */


    public static void main(String[] args) {
        System.out.println("Le jeu 21 Batons , celui qui prend le dernier baton a perdu !");
        System.out.println("Veuillez choisir combien de bâtons Max. par tirage:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int win = 20 % (n + 1);
        int tirer = 0;
        int client = 0;
        int ordinateur = 0;
        String result = "perdu";
        System.out.println("Voulez - vous tirer en premier(y/n)");
        String choice = scanner.next();


        if ("y".equals(choice) || "Y".equals(choice)) {
            System.out.println("Il reste " + (21 - tirer) + " Batons");
            System.out.print("Votre tour (1-" + n + ")" + ": ");
            client = scanner.nextInt();
            tirer += client;
            System.out.println();
        }


        while (tirer < 21) {
            if (tirer < win) {
                System.out.println("Il reste " + (21 - tirer) + " Batons");
                System.out.println("Ordinateur : " + (win - tirer));
                tirer = win;
                win += n + 1;
            } else if (tirer > win) {
                win += n + 1;
                System.out.println("Il reste " + (21 - tirer) + " Batons");
                System.out.println("Ordinateur : " + (win - tirer));
                tirer = win;
                win += n + 1;
            } else {
                ordinateur = 1 + (int) (Math.random() * n);
                if (win == 20) {
                    result = "gagné";
                    break;
                }
                System.out.println("Il reste " + (21 - tirer) + " Batons");
                System.out.println("Ordinateur : " + ordinateur);
                tirer += ordinateur;
                win += n + 1;
            }
            System.out.println("Il reste " + (21 - tirer) + " Batons");
            System.out.print("Votre tour (1-" + n + ")" + ": ");
            client = scanner.nextInt();
            tirer += client;
            System.out.println();

        }
        System.out.println("Vous Avez " + result + "!");
    }
}
