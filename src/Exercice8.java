import java.util.Scanner;
public class Exercice8 {
    public static void main(String[] args) {
/* Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
Principe du fonctionnement d'une équation du 2nd degré:
*/

        Scanner input=new Scanner(System.in);

        System.out.print("a= ");
        float a= input.nextFloat();

        System.out.print("b= ");
        float b= input.nextFloat();

        System.out.print("c= ");
        float c= input.nextFloat();

        double discriminant=(Math.pow(b,2)-4*a*c);

        if(a==0){
            System.out.println("Il ne s'agit pas d'une equation du second degre.");
        } else {

            if (discriminant < 0) {
                System.out.println("L'equation n'a pas de solution reelle.");
            } if (discriminant == 0) {
                float x0=(float)((-b) / (2 * a));
                System.out.println("L'equation a une solution unique :"+x0+"");
            } else {
                float x1=(float)((-b - (Math.sqrt(discriminant))) / (2 * a));
                x1=Math.round(x1);
                float x2=(float) (((-b) + (Math.sqrt(discriminant))) / (2 * a));
                x2=Math.round(x2);
                System.out.println("L'equation a deux solutions relles distinctes : "+x1+" et "+x2+"");
            }
        }
    }
}