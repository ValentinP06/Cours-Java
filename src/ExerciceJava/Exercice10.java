package ExerciceJava;

public class Exercice10 {
    public static void main(String[] args) {
      /* Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
Votre programme devra produire la sortie suivante à l'écran :
Tables de multiplication
Table de 2 :
1 * 2 = 2
...
10 * 2 = 20
 ...
Table de 5 :
1 * 5 = 5
2 * 5 = 10
... ...
 */

        System.out.println("Tables de multiplication");

        for(int i=2;i<=10;i=i+1) {
            //System.out.printf("\nTable de "+i+" :\n\n");
            System.out.printf("\ntable de %d\n",i);

            for(int j=1;j<=10;j=j+1) {
                System.out.printf("%d x %d = %d\n",j,i,(i * j));
            }
        }
    }
}