package ExerciceJava;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
/*Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche
 le nom du mois correspondant.
        Ex:
        Mois : 4
        Résult : Avril
        Pour cet exercices, vous devez aussi présenter une version qui utilise le sélecteur
         de cas(à trouver sur internet)*/

        byte mois = 0;
        String monthStr;

        while (mois < 1 || mois > 12){
            System.out.print("Please select give a number between 1 and 12: ");
            Scanner input = new Scanner(System.in);
            mois = input.nextByte();
        }


        switch (mois){
            case 1:
                monthStr = "January";
                break;
            case 2:
                monthStr = "February";
                break;
            case 3:
                monthStr = "March";
                break;
            case 4:
                monthStr = "April";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "June";
                break;
            case 7:
                monthStr = "July";
                break;
            case 8:
                monthStr = "August";
                break;
            case 9:
                monthStr = "September";
                break;
            case 10:
                monthStr = "October";
                break;
            case 11:
                monthStr = "November";
                break;
            case 12:
                monthStr = "December";
                break;
            default:
                monthStr = "Invalid";
        }

        System.out.printf("Selected month: " + monthStr);


    }
}
