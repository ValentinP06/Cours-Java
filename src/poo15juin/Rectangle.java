package poo15juin;

public class Rectangle {
    double longueur;
    double largeur;

    double calculDeLaSurface(){
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }
}