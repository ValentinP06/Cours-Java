import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("nom ?");
        String nom = sc.next();

        System.out.print("prenom ?");
        String prenom = sc.next();

        System.out.print("age ?");
        byte age = sc.nextByte();

        System.out.println("vous vous appelez"+nom+","+prenom+","+age+"ans");

    }
}
