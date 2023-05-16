package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int[] mergedArr = new int[array1.length + array2.length];
        int i = 0;
        for (int x :
                array1) {
            mergedArr[i++] = x;
        }
        for (int x :
                array2) {
            mergedArr[i++] = x;
        }
    }
}
