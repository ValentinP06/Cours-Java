package ApprocheProcedurale;

public class Exercice1 {

    static boolean isPrefix(String string1, String string2){

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string2.length() > string1.length()){
            System.out.println("String 2 is bigger than string 1 !");
            return false;
        }
        string1 = string1.substring(0,string2.length());

        return string1.equals(string2);
    }
    public static void main(String[] args) {

        /*
Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite
retourne un booléen(true/false) selon que le 2ème string est le préfixe du premier ou pas.
Ex :
isPrefix("banner", "bang")
> false

isPrefix("hugging", "hug")
> true
         */

        System.out.println( isPrefix("Hugging", "Hug" ));
        System.out.println( isPrefix("Bugging", "Hug" ));
        System.out.println( isPrefix("Hug", "Hugging" ));

    }
}
