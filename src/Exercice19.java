import java.util.Scanner;

public class Exercice19 {
    public static void main(String[] args) {

        /*
Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, renseigne si celui est un palindrome(mot qui se lit de la même dans les 2 sens).
Ex :
Entrez un text : non
Résultat : non est un palindrome
Entrez un text : oui
Résultat : oui n'est pas un palindrome
C'est quoi un palindrome?: https://www.larousse.fr/dictionnaires/francais/palindrome/57418
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez une phrase : ");

        String Phrase = input.nextLine();
        boolean palindrome = true;
        String PhraseTemporaire = "";

        for (int i = 0; i < PhraseTemporaire.length(); i++) {
            char a =PhraseTemporaire.charAt(i);
        }
        PhraseTemporaire = Phrase;

        int LettreGauche = 0;
        int LettreDroite = PhraseTemporaire.length() - 1;
        while ((LettreGauche < LettreDroite) && palindrome) {
            if (PhraseTemporaire.charAt(LettreGauche) != PhraseTemporaire.charAt(LettreDroite)) {
                palindrome = false;
            }
            LettreGauche=LettreGauche+1;
            LettreDroite=LettreDroite+1;
        }
        if (palindrome) {
            System.out.println("c'est est un palindrome" );
        } else {
            System.out.println("Non, ce n'est pas un palindrôme.");
        }
    }
}
