package poo15juin.Exercice1;
import poo15juin.Rectangle;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        TP 1 POO:
Ecrire une classe Personne qui est décrit par les données suivantes:
firstName
lastName
pays
married(booléen)
nombreEnfants

On doit avoir une méthode qui retourne un string nomComplet

Dans le main, vous devez à partir du clavier demander à l'utilisateur de
fournir toutes ces données et enfin les afficher dans main.
         */

        Scanner input = new Scanner(System.in);

        Personne nouvellepersonne = new Personne();
        System.out.println("entrer firstname : ");
        nouvellepersonne.firstName = input.nextLine();

        System.out.println("entrer lastname : ");
        nouvellepersonne.lastName = input.nextLine();

        System.out.println("entrer country : ");
        nouvellepersonne.pays = input.nextLine();

        System.out.println("est married : ");
        String marieQuestion= input.nextLine();

        if(marieQuestion.equals("oui")){

            nouvellepersonne.married = true;
        } else {
            nouvellepersonne.married = false;
        }
        System.out.println("combien d'enfants : ");
        nouvellepersonne.nombrenfants = input.nextInt();

        System.out.println("vous vous appelez :"+nouvellepersonne.nomComplet() );

        System.out.println("vous venez de :"+nouvellepersonne.pays) ;

        System.out.println("vous avez :"+nouvellepersonne.nombrenfants);

        System.out.println("vous" + (nouvellepersonne.married?" etes marie":" netes pas marrie"));
    }
}
