import java.util.Scanner;

public class Exercice20 {
    public static void main(String[] args) {
/*
Ecrire un programme java qui demande à l'utilisateur de remplir une matrice carré 4 x 4 et qui ensuite
 va calculer la somme des elements de la diagonale
 */
        Scanner input = new Scanner(System.in);

        int[][] Matrice = new int[4][4];
        int SommeDiagonale = 0;

        for (int i = 0; i <= Matrice.length-1; i++) {

            for (int j = 0; j <= Matrice[i].length-1; j++) {

                System.out.printf("Ligne : %d, colonne : %d: ", i, j);

                int AjouterNb = input.nextInt();

                Matrice[i][j] = AjouterNb;
                if (i == j){
                    SommeDiagonale = SommeDiagonale + AjouterNb;
                }
            }
        }

        System.out.printf("La somme de la diagonale est :  %d", SommeDiagonale);
    }
}
