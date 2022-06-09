import java.util.Scanner;
public class Exercice11 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("nombre ");
        int n= sc.nextInt();
        int fact = 1;

        for (int i=n; i>0;i=i-1)
        {
        fact=fact*i;
        }
        System.out.printf("ma factorielle est"+fact);

    }
}
