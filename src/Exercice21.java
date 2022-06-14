import java.util.Scanner;

public class Exercice21 {
    public static void main(String[] args) {

/*
A partir du TP précédent, ajouter le calcul de la somme de 2 diagonales
 */

        Scanner input = new Scanner(System.in);

        int[][] Matrice = new int[4][4];
        int SommeDiagonale1 = 0;
        int SommeDiagonale2 = 0;

        for (int i = 0; i <= Matrice.length - 1; i++) {

            for (int j = 0; j <= Matrice[i].length - 1; j++) {

                System.out.printf("Ligne : %d, colonne : %d: ", i, j);

                int AjouterNb = input.nextInt();

                Matrice[i][j] = AjouterNb;

                if (i == j) {
                    SommeDiagonale1 = SommeDiagonale1 + AjouterNb;
                } else if (i + j == Matrice.length-1) {
                    SommeDiagonale2 = SommeDiagonale2 + AjouterNb;
                }
            }
        }

        System.out.printf("SOMME de la diagonale 1 est : %d\nS Somme de la diagonale 2 est : %d", SommeDiagonale1, SommeDiagonale2);
    }
}