import java.util.Scanner;
public class Exercice14 {
    public static void main(String[] args) {
/* A l'exercice précédent, s'ajoute un nouveau requirement:
Le nombre de fois que l'utilisateur peut saisir des mauvais identifiants
est limité à 5, ensuite le programme va s'arrêter avec un message disant.
"Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué".
Il faut dire à au user le nombre de tentatives restants
*/
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer email: ");
        String email = input.next();

        System.out.print("Entrer MDP: ");
        String password = input.next();

        System.out.println("SUPER EMAIL ET MDP REALISE\n\n\n\n\n");

        // definir le nombre d'essai et le login validé ou pas

        int NBESSAI = 0;
        boolean loginValid;

        while (true) {
            System.out.print("entrer email: ");
            String emailtest = input.next();

            System.out.print("entrer mdp: ");
            String mdptest = input.next();

            if (email.equals(emailtest) && password.equals(mdptest)) {
                System.out.println("Login good super.");
                loginValid = true;
                break;
            }
            if (5 - NBESSAI == 0) {
                loginValid = false;
                break;
            } else if (5 - NBESSAI == 1) {
                System.out.print("DERNIER ESSAI)\n");
            } else {
                System.out.printf("REESAYE (%d essai restants) \n", (5 - NBESSAI));
            }
            NBESSAI=NBESSAI+1;
        }

        if (loginValid) {
            System.out.println("VOUS ETES CONNECTES");
        } else {
            System.out.println("TROP D'ESSAI");
        }


    }
}

