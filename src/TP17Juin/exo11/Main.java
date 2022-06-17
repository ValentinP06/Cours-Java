package TP17Juin.exo11;

public class Main {

    public static void main(String[] args) {

        Bibliotheque bibliothequeMunicipale = new Bibliotheque("Bibliotheque municipale");

        Exemplaires valentinExemplaire = new Exemplaires("Valentin", false, "EXEMPLAIRE", "BORDELAIS");

        bibliothequeMunicipale.stocker(valentinExemplaire);

        bibliothequeMunicipale.afficherAuteur(valentinExemplaire);
        bibliothequeMunicipale.afficherAuteur(valentinExemplaire, true);

        System.out.println((bibliothequeMunicipale.getNbExemplaires()));


        Exemplaires marionExemplaire = new Exemplaires("Marion", true, "Perez life ", "TOULSAING");
        bibliothequeMunicipale.stocker(marionExemplaire, 2);

        bibliothequeMunicipale.listerExemplaires();


        bibliothequeMunicipale.afficherAuteur(marionExemplaire, true);


    }
}