package ExerciceJava;

import java.util.Scanner;

public class Exercice18 {

    public static void main(String[] args) {
        /*
Ecrire un programme Java demande à l'utilisateur de saisir un texte et qui ensuite, retourne la chaine inverse.
Ex:
Votre chaine : mamy
Résultat : ymam
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Saisissez un mot ou une phrase: ");
        String texte = input.nextLine();

        String TexteRenverser = "";

        for (int i = texte.length() - 1; i >= 0; i--) {
            TexteRenverser = TexteRenverser + texte.charAt(i);
        }

        System.out.printf("Le texte renversé est : %s", TexteRenverser);
    }
}



