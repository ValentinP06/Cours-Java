import java.util.Scanner;

public class Exercice16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pour le  tableau 1: ");
        int[] tableau1 = new int[input.nextInt()];
        System.out.println("Pour le  tableau 2: ");
        int[] tableau2 = new int[input.nextInt()];
        System.out.println("Pour le  tableau 3: ");
        int[] tableau3 = new int[input.nextInt()];


        int SommedesmultIplede3 = 0;
        String valeurmultipledetrois = "";

        for (int i = 0; i <= tableau1.length-1; i++)
        {
            System.out.printf("Valeur de %d du tableau 1: ", i);
            int valeurtemporaire = input.nextInt();

            if (valeurtemporaire % 3 == 0){
                SommedesmultIplede3 = SommedesmultIplede3 + valeurtemporaire;
                valeurmultipledetrois =valeurmultipledetrois+ " + " + valeurtemporaire;
            }
            tableau1[i] = valeurtemporaire;
        }

        for (int i = 0; i <= tableau2.length-1; i++) {
            System.out.printf("Valeur de %d du tableau 2: ", i);
            int valeurtempo = input.nextInt();

            if (valeurtempo % 3 == 0){
                SommedesmultIplede3 = SommedesmultIplede3 + valeurtempo;
                valeurmultipledetrois = valeurmultipledetrois+ " + " + valeurtempo;
            }
            tableau2[i] = valeurtempo;
        }

        for (int i = 0; i <= tableau3.length-1; i++) {
            System.out.printf("Valeur de %d du tableau 3: ", i);
            int valeurtempo = input.nextInt();

            if (valeurtempo % 3 == 0){
                SommedesmultIplede3 = SommedesmultIplede3 + valeurtempo;
                valeurmultipledetrois = valeurmultipledetrois+ " + " + valeurtempo;
            }
            tableau3[i] = valeurtempo;
        }
        System.out.println("Total multiples de 3: " + SommedesmultIplede3);
        System.out.println("valeurs: " + valeurmultipledetrois);
    }
}


