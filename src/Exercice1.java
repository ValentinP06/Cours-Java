public class Exercice1 {
    public static void main(String[] args) {
/*Ecrire un algorithme qui demande l'âge d'un enfant. Ensuite, il l'informe de sa catégorie :
« Poussin » de 7 à 9 ans
« Pupille » de 10 à 11 ans
« Benjamin » de 12 à 13 ans
« Minime » de 14 à 15 ans
« Cadet » 16 à 17 ans*/

        byte age=4;
        if(age<7){
            System.out.println("trop petit");
        }else if (age<=9) {
            System.out.println("POUSSIN");
        }else if (age<=11) {
            System.out.println("PUPILLE");
        }else if (age<=13) {
            System.out.println("BENJAMIN");
        }else if(age<=15) {
            System.out.println("MINIME");
        }else if (age<=17) {
            System.out.println("CADET");
        }else{
            System.out.println(" pas supporte");
        }
    }
}
