import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Valeur du diametre ");
        int diametre= sc.nextInt();
        float Rayon=diametre/2;
        double surface=Rayon*Rayon*Math.PI;
        System.out.println(surface);
    }
}
