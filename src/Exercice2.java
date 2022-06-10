import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Valeur du diametre ");
        int diametre= sc.nextInt();

        double Rayon=diametre/2;

        double surface=Rayon*Rayon*Math.PI;

        System.out.println("Ma surface est de : "+ surface);
    }
}
