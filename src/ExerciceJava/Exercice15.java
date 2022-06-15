package ExerciceJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercice15 {
    public static void main(String[] args) {
        /* Ajouter une validation de type de donnees pour que le code PIN saisi ne soit compose que des chiffres*/

        Scanner input = new Scanner(System.in);
        String PINcode;
        String PINinput;

        System.out.print("Create your PIN (4 digits): ");

        while (true) {

            PINcode = input.nextLine();
            if (Pattern.matches("[0-9]{4}", PINcode)) {
                break;
            }
            System.out.print("Please enter a valid PIN: ");
        }

        System.out.println("\n------ Succesfully created PIN. ------\n");

        System.out.print("\nEnter your PIN: ");

        while (true) {

            PINinput = input.nextLine();

            if (PINinput.equals(PINcode)) {
                System.out.println("PIN code correct. Welcome");
                break;
            }

            System.out.print("Incorrect PIN, please try again: ");
        }
    }
}

