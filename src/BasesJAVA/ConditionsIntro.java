package BasesJAVA;

public class ConditionsIntro {
    public static void main(String[] args) {
        // Declaration de la variable age
        byte age=18;

        //Test condition
        //si age >= 18 alors
        // Afficher "Vous êtes majeur, et pouvez donc participer a la compétition"
        // fin sin
        //Sinon
        //Afficher "Vous êtes mineur, et vous ne pouvez pas y participer"
        //Fin sin
        if(age>=18){
            System.out.println("Vous etes majeur. Donc vous pouvez participer");
        }else {
            System.out.println("Vous n'etes pas majeur, donc vous ne pouvez pas participer");
        }

        String pays="Chines";
        if(pays=="France"){
            System.out.println("Bonjour");
        } else if (pays=="Allemagne") {
            System.out.println("Guten tag");
        } else if (pays=="Espagne") {
            System.out.println("Hola");
        } else if (pays=="Chine") {
            System.out.println("Ninhau");
        }else{
            System.out.println("LE pays fourni n'est pas supporte");
        }
    }
}
