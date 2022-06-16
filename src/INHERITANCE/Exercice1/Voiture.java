package INHERITANCE.Exercice1;

public class Voiture extends Vehicule{


    public Voiture(int AnneModele, double Prix) {
        super(AnneModele, Prix);
    }

    @Override
    public void Demarrer() {
        System.out.println("la voiture va demarrer================");
    }

    @Override
    public void Accelerrer() {
        System.out.println("la voiture va accelerer===================");
    }

    }

