import java.util.Scanner;
public class Exercice11 {
    public static void main(String[] args) {

        /* Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre et qui ensuite va
         calculer et afficher la factorielle de ce nombre:
Ex:
Nombre : 3
Factorielle de 3 : 3x2x1 = 6
Regle de calcul de factorielle : http://villemin.gerard.free.fr/Denombre/Factorie.htm */

        Scanner sc= new Scanner(System.in);
        System.out.print("nombre ");
        int n= sc.nextInt();
        int fact = 1;

        for (int i=n; i>0;i=i-1)
        {
        fact=fact*i;
        }
        System.out.printf("ma factorielle est %d", fact);

    }
}
