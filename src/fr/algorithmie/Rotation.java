package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        int temporary = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            array[array.length - 1 - i] = array[array.length - 2 - i];
        }
        array[0] = temporary;
        for (int x :
                array) {
            System.out.println(x);
        }
    }
}
