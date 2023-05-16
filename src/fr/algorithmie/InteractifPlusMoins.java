package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int number = (int) (1 + Math.random() * 100);
        boolean go = true;
        int times = 0;
        System.out.println("The number is between 1 and 100 !");
        while (go) {
            times++;
            System.out.println("Please guess the number :");
            Scanner scanner = new Scanner(System.in);
            int nb = scanner.nextInt();
            if (nb < number) {
                System.out.println("Il est en dessous du nombre !");
            } else if (nb > number) {
                System.out.println("Il est au-dessus du nombre !");
            } else {
                System.out.println("Bravo, vous avez trouvé en " + times + " coups");
                go = false;
            }
        }
    }
}
