package TP17Juin.exo1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {

        /*
Écrire un programme Java permet de déclarer un tableau d’entiers en Java,
 et qui ensuite va afficher le plus grand nombre, sa position; le plus petit nombre,
  et sa position.

Dans l’affichage, il faut afficher le tableau en format [element1, element2,...,elementN],
 et dans l’affiche du plus grand nombre faire afficher le text(PG) et pour le plus petit(PP):

Ex :
Tb : [ 12,3,5,6,-3 ]
Résultat:

Tb : [12(PG) , 3, 5, 6, -3(PP)]
Plus grand : 12
Plus petit : -3
         */



                int arrayLength;
                int min = 0;
                int minPosition = 0;
                int max = 0;
                int maxPosition = 0;

                // Create scanner
                Scanner input = new Scanner(System.in);

                // Ask user to input table size then values
                // (note that no check for negative ints)
                System.out.printf("Array length: ");
                arrayLength = input.nextInt();

                // Create empty int array of length defined above
                int[] array = new int[arrayLength];

                // Loop through the array and let the user define each value.
                // At the same time, look for min and max value
                for (int i = 0; i < array.length; i++) {
                    System.out.printf("Value of index %d: ", i);
                    int userInput = input.nextInt();
                    array[i] = userInput;
                    // If first element, assign to min and max the value

                    if (i == 0){
                        min = userInput;
                        max = userInput;
                    } else {
                        min = Math.min(min, userInput);
                        max = Math.max(max, userInput);
                    }
                }

                // Create string array for display purpose
                String[] resultArray = new String[arrayLength];

                for (int i = 0; i < array.length; i++) {
                    resultArray[i] = String.valueOf(array[i]);
                    if (array[i] == min){
                        minPosition = i;
                        resultArray[i] = String.valueOf(array[i]) + " (PP)";
                    }
                    if (array[i] == max){
                        maxPosition = i;
                        resultArray[i] =  String.valueOf(array[i]) + " (PG)";
                    }
                }

                // Print the results (note that if there are duplicated max and min it will take first in array)
                System.out.printf("The minimum found is %d at position %s\n", min, minPosition);
                System.out.printf("The minimum found is %d at position %s\n", max, maxPosition);

                System.out.println(Arrays.toString(resultArray));
            }
        }