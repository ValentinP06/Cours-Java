package ExerciceJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercice24 {
    public static void main(String[] args) {
/* Ecrire un programme Java qui permet à l'utilsateur de déclarer 2 tableaux:
1 tableau correspondant au numéro du jour de la semaine(ex : 1 pour Lundi)
1 tableau correspondant au nom des jours de la semaine(Ex : Lundi)
Associer les 2 informations dans un HashMap
Permettre à l'utilisation d'associer via un HasMap le numéro correspondant au jour et le jour de la semaine correspondant.

Pour les jours de la semaine et le numéros correspondant, veuillez stocker les données dans des Set(recherche sur internet)  */
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> jourssemainHashMap = new HashMap<>();

        String joursdelasemaine[] = {"Lundi", "Mardi", "Mercredi", "jeudi", "vendredi", "samedi", "dimanche"};

        int weekDayInt[] = new int[joursdelasemaine.length];

        // create index table + hashmap by looping through the weekDayStr array.
        for (int i = 0; i < weekDayInt.length; i++) {
            weekDayInt[i] = i + 1;
            jourssemainHashMap.put(i + 1, joursdelasemaine[i].toUpperCase());
        }

        boolean intSearch; // if true: the user wants to lookup by index (key); if false: by string (value)
        String searchType;

        System.out.printf("\n\n\n\n- if searching by index, type 'int'\n- if searching by String, type 'str': ");

        while (true) {

            searchType = input.nextLine();
            if (searchType.equals("str")) {
                intSearch = false;
                break;
            } else if (searchType.equals("int")) {
                intSearch = true;
                break;
            } else {
                System.out.println("Specify correct type\n");
            }
        }
        int lookupInt;
        String lookupStr;

        while (true) {
            if (intSearch) {

                // when searching by index

                System.out.printf("day number to lookup: ");
                lookupInt = input.nextInt();

                // check if int exists in keys (1-7)
                if (jourssemainHashMap.containsKey(lookupInt)) {

                    // loop through the hashmap and check equality currentKey = keyLookedUp
                    for (Map.Entry<Integer, String> entry : jourssemainHashMap.entrySet()) {
                        if (entry.getKey().equals(lookupInt)) {
                            System.out.printf("Key [%d] has value: %s\n", lookupInt, entry.getValue());
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("Incorrect entry, try again");
                }

            } else {

                // when searching by string

                System.out.printf("day to lookup: ");
                lookupStr = input.nextLine().toUpperCase();

                // check if string exists in values

                if (jourssemainHashMap.containsValue(lookupStr)) {

                    // loop through the hashmap and check equality currentValue = valueLookedUp
                    for (Map.Entry<Integer, String> entry : jourssemainHashMap.entrySet()) {
                        if (entry.getValue().equals(lookupStr)) {
                            System.out.printf("valeur %s comme key [%d]\n", lookupStr, entry.getKey());
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("recommence ");
                }
            }
        }
    }
}