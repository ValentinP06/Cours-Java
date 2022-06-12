public class Exercice4 {
    public static void main(String[] args) {
        /* Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
Exemple :
Entrez la première valeur(a) : 51
Entrez la deuxième valeur(b) : 876
Entrez la troisième valeur(c) : 235
Les valeurs entrées sont : a = 51, b = 876 et c = 235
Permutation: b <== a, c <== b, a <== c
Les valeurs permutées sont : a = 235, b = 51 et c = 876
*/
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
