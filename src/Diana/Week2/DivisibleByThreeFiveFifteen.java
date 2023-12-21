package Diana.Week2;

public class DivisibleByThreeFiveFifteen {

        public static void main(String[] args) {
            divisibleBy();
        }

        public static void divisibleBy() {
            System.out.print("Divisible By 15 ");
            for (int i = 1; i < 100; i++) {
                if (i % 15 == 0) {
                    System.out.print(+i + " ");
                }
            }
            System.out.println();
            System.out.print("Divisible By 5 ");
            for (int i = 1; i < 100; i++) {
                if (i % 5 == 0) {
                    System.out.print(+i + " ");
                }
            }
            System.out.println();
            System.out.print("Divisible By 3 ");
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(+i + " ");
                }
            }
        }
    }


