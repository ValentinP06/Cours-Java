public class Variable {
    public static void main(String[] args) {
        //Les variables/fonctions en Java sont en camelCase
        //Les classes vont être en PascalCase

        //Les entiers

        byte age=18;//La variable ne peut stocker que des entiers
        //Calcul Rectangle
        int longueur=50;
        int largeur=25;
        int surface=longueur*largeur;
        int perimetre=2*(longueur+largeur);
        System.out.println(surface);
        System.out.print(perimetre);

        // Reels
        //Calcul de la vitesse moyenne en MRU
        float distanceParcours=90.6F;
        float temps=12.345F;
        double vitesseMoyenne=distanceParcours/temps;
        double vitesseMoyenne2=56.45;

        //Calcul somme des nombres
        float prix=150.5F;

        // Chaine de caracteres et caracters
        String prenom="Christian";// Chaine de caractères
        char genre='M';


        //35.7654567876543 : double
        //35.6 : float

    }
}
