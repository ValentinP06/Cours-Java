import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
/* Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
Exemple d'exécution:
Entrez un nombre entier: 5
Le nombre est positif et impair
Entrez un nombre entier: -4
Le nombre est négatif et pair
Entrez un nombre entier: 0
Le nombre est zéro (et il est pair)
*/

        Scanner sc= new Scanner(System.in);
        System.out.print("entrez un nombre entier: ?");
        int nombre = sc.nextInt();
        boolean estPaire= (nombre % 2 == 0);
        boolean estPositif= (nombre > 0);

        if (nombre==0){
            System.out.println("le nombre est nul et positif");
        } else {
        System.out.printf("le nombre %s et %s",estPaire?"est paire":"est impaire",estPositif?"positif":"negatif");
        }
    }
}
