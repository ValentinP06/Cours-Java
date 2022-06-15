package ExerciceJava;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        /* Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre,
        et qui ensuite va effectuer le calcul de la surface.
        Surface = Rayon x Rayon x PI;
        Rayon = Diamètre / 2
        */

        Scanner sc= new Scanner(System.in);
        System.out.print("Valeur du diametre ");
        int diametre= sc.nextInt();

        double Rayon=diametre/2;

        double surface=Rayon*Rayon*Math.PI;

        System.out.println("Ma surface est de : "+ surface);
    }
}
