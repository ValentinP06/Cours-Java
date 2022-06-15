package ExerciceJava;

import java.util.Scanner;
public class Exercice12 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("nombre :");
        int n= sc.nextInt();

        for (int i=n+1; i<=(n+10);i=i+1){
            System.out.println(i);
        }
    }
}
