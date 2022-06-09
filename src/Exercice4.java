public class Exercice4 {
    public static void main(String[] args) {
        int A= 51;
        int B= 876;
        int C= 235;

        int atemp= A;
        int btemp= B;
        int ctemp= C;
        B=atemp;
        C=btemp;
        A=ctemp;

        //System.out.println(A+" "+B+" "+C );
        System.out.printf("%d %d %d",A,B,C);

    }
}
