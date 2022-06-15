package ExerciceJava;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        /*Ecrire un programme Java qui demande à l'utilisateur de saisir son nom, prenom et age,
          et qui ensuite va afficher le message : "Vous vous appelez <prenom> <nom>, et vous avez <age> ans"
         */


        Scanner sc= new Scanner(System.in);
        System.out.print("nom ?");
        String nom = sc.next();

        System.out.print("prenom ?");
        String prenom = sc.next();

        System.out.print("age ?");
        byte age = sc.nextByte();

        //System.out.println("vous vous appelez"+nom+","+prenom+","+age+"ans");
        System.out.printf("Vous vous appellez %s %s et vous avez %d ans", nom,prenom,age);

    }
}
