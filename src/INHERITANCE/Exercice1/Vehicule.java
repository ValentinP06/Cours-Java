package INHERITANCE.Exercice1;

import INHERITANCE.Magicien;

abstract class Vehicule {

private int Matricule;
private int AnneModele;
private double Prix;
private static int NombreVéhicules = 1;



    public int getMatricule() {
        return Matricule;
    }

    public void setMatricule(int matricule) {
        Matricule = Matricule;
    }

    public int getAnnemModele() {
        return AnneModele;
    }

    public void setAnnemModele(int annemModele) {
        AnneModele = AnneModele;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        this.Prix = Prix;
    }

    public static int getNombreVéhicules() {
        return NombreVéhicules;
    }

    public Vehicule(int AnneModele, double Prix)
    {
        NombreVéhicules++;
        NombreVéhicules =this.Matricule ;

        this.AnneModele = AnneModele;
        this.Prix = Prix;
    }


    public abstract void Demarrer();
    public abstract void Accelerrer();

    @Override
    public String toString() {
        return "matricule:"+this.Matricule +"\n Annee modele :" + this.AnneModele +"\n prix : "+ this.Prix;
    }
}

