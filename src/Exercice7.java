import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("entrez un nombre entier: ?");
        int nombre = sc.nextInt();
        boolean estPaire= (nombre % 2 == 0);
        boolean estPositif= (nombre > 0);

        if (nombre==0){
            System.out.println("le nombre est nul et positif");
        } else {
        System.out.printf("le nombre %s et %s",estPaire?"est paire":"est impaire",estPositif?"positif":"negatif");
        }
    }
}
