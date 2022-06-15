package BasesJAVA;

import java.util.Arrays;

public class ArrayStorage {
    public static void main(String[] args) {

        int b;
//        System.out.println(b);

        //Tableau d'entiers(int/byte/short) Java initialise toutes les cellules par 0
        //Tableau de floats/double Java initialise toutes les cellules par 0.0
        //Tableau de booleans Java initialise toutes les cellules par false
        //Tableau de String Java initialise toutes les cellules par null(un objet qui
        // ne pointe vers rien)

        int[] a=new int[5];
        System.out.print("BasesJAVA.Affichage de l'adress stockée dans a : ");
        System.out.print(a);

        System.out.println();
        System.out.println("BasesJAVA.Affichage du tableau :"+ Arrays.toString(a));
    }
    }

