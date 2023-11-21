package EmmaTasks.Diana.week1;

public class FINRA {

        public static void main(String[] args) {
            Finra();
        }

        public static void Finra() {
            // if 30 % 3  = 0 -> FIN
            // if 30 % 5 = 0 -> RA
            // if 1 && 2 true -> FIRNA

            for (int a = 1; a <= 30; a++) {

                if (a % 3 == 0 && a % 5 == 0) {
                    System.out.println("FINRA");
                } else if (a % 3 == 0) {
                    System.out.println("FIN");
                } else if (a % 5 == 0) {
                    System.out.println("RA");
                } else {
                    System.out.println(a);
                }

            }
        }
    }

