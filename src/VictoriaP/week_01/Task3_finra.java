package VictoriaP.week_01;

public class Task3_finra {
    public static void main(String[] args) {

    }

    public static void finra() {


        for (int a = 1; a <= 30; a++) {

            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FINRA"); //--> Rare condition should be on top
            } else if (a % 3 == 0) {
                System.out.println("FIN"); //--> less rare
            } else if (a % 5 == 0) {
                System.out.println("RA");// --> less rare
            } else {
                System.out.println(a);
            }

        }
    }
}