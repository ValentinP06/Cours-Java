package ExerciceJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice22 {
    public static void main(String[] args) {

        /*
Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de programmations à partir du clavier.
Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages qu'il souhaite retirer de liste.
Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant et après la suppression.
         */
        Scanner input = new Scanner(System.in);
        ArrayList<String> languagedeProgrammation = new ArrayList<>();

        String nomProgramme;

        while (true) {
            System.out.printf("ajouter programme : ");
            nomProgramme = input.nextLine();
            if (nomProgramme == "") {
                break;
            }
            languagedeProgrammation.add(nomProgramme);
        }
        System.out.println("\nLanguage choisi : " + languagedeProgrammation + "\n");

        var ProgrammePrecedent = languagedeProgrammation;

        while (true) {
            System.out.printf("Que voulez vous supprimer ?  ");
            nomProgramme = input.nextLine();
            if (nomProgramme == "") {
                break;
            }
            languagedeProgrammation.remove(nomProgramme);
        }

        System.out.println("Avant la suppression : " + ProgrammePrecedent);

        System.out.println("\nAprès suppression: " + languagedeProgrammation);
    }
}

