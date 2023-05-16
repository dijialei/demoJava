package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 1};
        boolean boolean1 = (array.length > 0 && array[0] == array[array.length - 1] )? true:false;
        System.out.println(boolean1);
    }
}
