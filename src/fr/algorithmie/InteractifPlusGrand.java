package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Please enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.println("The "+ i+1 +" number :");
            Scanner scanner = new Scanner(System.in);
            array[i] = scanner.nextInt();
        }
        int temporary = array[0];
        for (int x:
             array) {
            if (temporary < x) temporary = x;
        }
        System.out.println(temporary);
    }
}
