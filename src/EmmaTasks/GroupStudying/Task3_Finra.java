package EmmaTasks.GroupStudying;

public class Task3_Finra {
    public static void main(String[] args) {
        finra();
    }

    public static void finra() {
        // if 30 % 3  = 0 -> FIN
        // if 30 % 5 = 0 -> RA
        // if 1 && 2 true -> FIRNA

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
