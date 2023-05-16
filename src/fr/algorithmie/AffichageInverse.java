package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int lengthArr = array.length;
        for (int i = 0; i < lengthArr; i++) {
            System.out.println(array[i]);
        }
        System.out.println("**************************");
        for (int i = 1; i <= lengthArr; i++) {
            System.out.println(array[lengthArr - i]);
        }
        System.out.println("**************************");
        int[] arrayCpoy = new int[10];
        for (int i = 0; i < lengthArr ; i++) {
            arrayCpoy[i] = array[i];
        }

    }
}
