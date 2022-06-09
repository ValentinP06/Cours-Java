import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("age de l'utilisateur ?");
        int age = sc.nextInt();
        int anneeDeNaissance = 2022 - age;
        if (age < 0) {
            System.out.println("vous n'existez pas");
        } else
            System.out.println("Vous avez " + age + " ans et Votre annee de naissance est " + anneeDeNaissance);
    }
}
