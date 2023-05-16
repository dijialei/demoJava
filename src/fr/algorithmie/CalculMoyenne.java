package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[]array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        float somme = 0.0F;
        for (int x:
             array) {
            somme += x;
        }
        System.out.println("la moyenne des éléments du tableau : "+ somme / array.length);
    }
}
