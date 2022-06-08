public class Exercice1 {
    public static void main(String[] args) {

        byte age=47;
        if(age<7){
            System.out.println("trop petit");
        }else if (age<=9) {
            System.out.println("POUSSIN");
        }else if (age<=11) {
            System.out.println("PUPILLE");
        }else if (age<=13) {
            System.out.println("BENJAMIN");
        }else if(age<=15) {
            System.out.println("MINIME");
        }else if (age<=17) {
            System.out.println("CADET");
        }else{
            System.out.println(" pas supporte");
        }
    }
}
