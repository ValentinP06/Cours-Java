import java.util.Scanner;

public class Exercice17 {
    public static void main(String[] args) {
        /* Ecrire un programme Java qui demande à l'utilisateur de remplir un tableau d'entiers à partir du clavier.
           Puis le programme devra lui demander d'entrer un nombre à rechercher dans le tableau.
        Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu'ils se retrouve
        dans le tableau
        Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau
        Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
        ->Entrer un nombre à rechercher : 6
        ->6 existe et se retrouve 3 fois dans le tableau
         */
        Scanner input = new Scanner(System.in);

        int tableau1;

        while (true) {
            System.out.printf("tableau1: ");
            tableau1 = input.nextInt();
            if (tableau1 > 1){
                break;
            }
            System.out.println("nom > 1 obligatoire");
        }

        int[] tableau = new int[tableau1];

        for (int i = 0; i <= tableau.length-1; i++)
        {
            System.out.printf("ajouter nb dans tableau : ");
            tableau[i] = input.nextInt();
        }

        System.out.printf("Nb a checker: ");
        int nbrechercher = input.nextInt();
        int compteur = 0;

        for (int i = 0; i <= tableau.length-1; i++) {
            if (tableau[i] == nbrechercher){
                compteur=compteur+1;
            }
        }

        if (compteur>0){
            System.out.printf("nombre %d existe bel et bien et a ete trouver %d fois", nbrechercher, compteur);
        } else {
            System.out.printf("nombre %d non trouvé", nbrechercher);
        }

    }
}

