import java.util.ArrayList;
import java.util.Collections;

public class Exercice23 {
    public static void main(String[] args) {

        /*
Ecrire un programme Java qui remplit un tableau avec une liste des adresse email : christian.lisangola@gmail.com,
 jean.paul@gmail.com, alain@gmail.com, lydie@yahoo.fr, josephine.lajoie@yahoo.com, luise@hotmail.fr, philemon.turion@gmail.com, jules.cesar@hotmail.fr
Ensuite le programme va afficher en % le taux d'adresse gmail, yahoo et hotmail.
Essayer de le résoudre au plus, et essayer approche basé sur le HMap.
         */
        String[] mail = {
                "christian.lisangola@gmail.com",
                "jean.paul@gmail.com",
                "alain@gmail.com",
                "lydie@yahoo.fr",
                "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr",
                "philemon.turion@gmail.com",
                "jules.cesar@hotmail.fr"
        };
        ArrayList<String> nomdedomainedouble = new ArrayList<String>();
        ArrayList<String> nomDeDomainePasenDouble = new ArrayList<String>();

        String currentEmail;

        for (int i = 0; i < mail.length; i++) {
            currentEmail = mail[i];

            String nomdedomaine = currentEmail.substring(currentEmail.indexOf('@'), currentEmail.length());
            nomDeDomainePasenDouble.add(nomdedomaine);
            if (!nomdedomainedouble.contains(nomdedomaine)) {
                nomdedomainedouble.add(nomdedomaine);
            }
        }

        float Pourcentage;
        int Nombredemail = mail.length;


        for (int i = 0; i < nomdedomainedouble.size(); i++) {

            String nomdedomaine = nomdedomainedouble.get(i);
            System.out.println((float) Collections.frequency(nomDeDomainePasenDouble, nomdedomaine) / Nombredemail);
            Pourcentage = ((float) Collections.frequency(nomDeDomainePasenDouble, nomdedomaine)) / Nombredemail * 100;
            System.out.printf("Nom de domaine  %s qui represente %s pourcent de la liste d'emails\n", nomdedomaine, Pourcentage);
        }
    }
}
