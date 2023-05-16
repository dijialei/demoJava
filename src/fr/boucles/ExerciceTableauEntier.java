package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        byte[] array = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("**********************");
        System.out.println(array[0]);
        System.out.println("**********************");
        System.out.println(array.length);
        int lengthArr = array.length;
        System.out.println("**********************");
        System.out.println(array[lengthArr - 1]);
        array[4] = 8;

    }
}
