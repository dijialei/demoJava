package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1= {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        int nombre=0;
        for (int x:
             array1) {
            for (int y:
                 array2) {
                if (x == y) nombre++;
            }
        }
        System.out.println( nombre);
    }
}
