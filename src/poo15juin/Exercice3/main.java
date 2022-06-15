package poo15juin.Exercice3;

public class main {
    public static void main(String[] args) {

        /*
Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,et de calculer leur « Indice de Masse Corporelle» (IMC).
crée un patient,
affiche les données du patient ainsi que son IMC.
Avoir la possibilité de connaître la taille du patient, son poids
         */


        Patient patient1= new Patient();

        Patient patient2=new Patient();

        patient2.setNom("Dupont");
        patient2.setPrenom("Antoine");
        patient2.setAge((byte)25);
        patient2.setPoids(84);
        patient2.setTaille(1.75f);

        Patient patient3=new Patient("Pan","Peter",(byte)12,48,1.41f);

        patient1.interpretation();
        patient2.interpretation();
        patient3.interpretation();
    }
}
