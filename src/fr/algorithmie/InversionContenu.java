package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int lengthArr = array.length;
        int[] arrayCopy = new int[lengthArr];
        for (int i = 0; i < lengthArr ; i++) {
            arrayCopy[i]= array[lengthArr-1-i];
            System.out.println(array[i]+"*****"+ arrayCopy[i]);
        }
    }
}
