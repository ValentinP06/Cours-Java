package poo15juin;

public class Rectangle2 {
    double longueur;
    double largeur;

    double calculDeLaSurface(){
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }
}