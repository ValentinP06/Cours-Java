package ExerciceJava;

import java.util.Scanner;
public class Exercice13 {
    public static void main(String[] args) {
/* Ecrire un programme Javascript qui permet à l'utilisateur de définir une adresse email et un mot de passe.
Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:
Si l'email et le mot de passe ne correspondent pas aux valeurs définies, le message
"Identifiants incorrect devra s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.
*/

        var input = new Scanner(System.in);
        System.out.println("Veuillez definir un mail et un mot de passe : ");
        var mail = "";

        var motdepasse = "";

        while (true) {
            System.out.print("Mail : ");
            mail = input.nextLine();
            System.out.print("motdepasse  : ");
            motdepasse = input.nextLine();
            if (mail.length() == 10) {
                System.out.println("mail defini avec succes");
                break;
            }
            System.out.println("le mail n'est pas defini");
        }

        System.out.println("************************");
        System.out.println("**Ton compte est crée**");
        System.out.println("************************");

        String verificationmail = "";
        String verificationmdp = "";
        while (true) {
            System.out.print("Entrez votre mail pour deverouiller le compte : ");
            verificationmail = input.nextLine();
            System.out.print("Entrez votre mot de passe pour deverouiller le compte : ");
            verificationmdp = input.nextLine();

            if (!verificationmail.equals(mail)) {
                System.out.println("mail faux");
                verificationmail = input.nextLine();
            }
            if (!verificationmdp.equals(motdepasse)) {
                System.out.println("mot de passe faux");
                verificationmdp = input.nextLine();
            } else {
                System.out.println("bravo super tas un compte");
                break;
            }
        }
    }
}
