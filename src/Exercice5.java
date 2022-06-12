import java.util.Scanner;
public class Exercice5 {
    public static void main(String[] args) {
        /* Ecrivez un programme Age.java qui :
declare l'âge de l'utilisateur ;
lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
affiche l'année de naissance ainsi calculée.

Exemple d'exécution du programme:
age = 30
Votre année de naissance est : 1992
*/

        Scanner sc = new Scanner(System.in);
        System.out.print("age de l'utilisateur ?");
        int age = sc.nextInt();
        int anneeDeNaissance = 2022 - age;
        if (age < 0) {
            System.out.println("vous n'existez pas");
        } else
            System.out.println("Vous avez " + age + " ans et Votre annee de naissance est " + anneeDeNaissance);
    }
}
