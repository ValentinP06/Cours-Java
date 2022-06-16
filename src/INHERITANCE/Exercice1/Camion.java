package INHERITANCE.Exercice1;

public class Camion extends Vehicule{


    public Camion(int AnneModele, double Prix) {
        super(AnneModele, Prix);
    }

    @Override
    public void Demarrer() {
        System.out.println("le camion va demarrer================");
    }
    @Override
    public void Accelerrer() {
        System.out.println("le camion va accelerer===============");
    }
}
