package poo15juin;

public class main {
    public static void main(String[] args) {
        System.out.println("***********");
        System.out.println("**Objet 1**");
        System.out.println("************\n");
        Rectangle terrain = new Rectangle();
        System.out.println("Etat inital de l'objet après " +
                "création\n======================");
        System.out.println("La longueur : " + terrain.longueur);
        System.out.println("La largeur : " + terrain.largeur);

        System.out.println("Etat de l'objet après avoir fourni des " +
                "valeur\n==========================");
        terrain.longueur = 500;
        terrain.largeur = 350;
        System.out.println("La longueur : " + terrain.longueur);
        System.out.println("La largeur : " + terrain.largeur);
        System.out.println("Surface : " + terrain.calculDeLaSurface());
        System.out.println("Perimète : " + terrain.calculDuPerimetre());


        System.out.println("***********");
        System.out.println("**Objet 2**");
        System.out.println("************\n");
        Rectangle parcelle = new Rectangle();
        System.out.println("La longueur : " + parcelle.longueur);
        System.out.println("La largeur : " + parcelle.largeur);

    }
}