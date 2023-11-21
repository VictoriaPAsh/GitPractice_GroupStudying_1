package EmmaTasks.Diana.week2;

public class ConsecutiveNumbers {

    public static void main(String[] args) {
        ConsecutiveNumbers(17);
        ConsecutiveTurnery(17);


    }

    public static void ConsecutiveNumbers( int num) {
        for (int n = 1; n <= num; n++) {
            if (n % 2 == 0 && n % 3 == 0 && n % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (n % 2 == 0 && n % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (n % 2 == 0 && n % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("TestCoders");
            } else if (n % 2 == 0) {
                System.out.println("Codility");
            } else if (n % 3 == 0) {
                System.out.println("Test");
            } else if (n % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(n);
            }

        }
    }
    public static void ConsecutiveTurnery (int num){
        for (int n = 1; n <= num; n++) {
            System.out.println(
                    (n % 2 == 0 && (n % 3) == 0 && n % 5 == 0) ? "CodilityTestCoders" :
                            (n % 2 == 0 && n % 3 == 0) ? "CodilityTest" :
                                    (n % 2 == 0 && n % 5 == 0) ? "CodilityCoders" :
                                            (n % 3 == 0 && n % 5 == 0) ? "TestCoders" :
                                                    (n % 2 == 0) ? "Codility" :
                                                            (n % 3 == 0) ? "Test" :
                                                                    (n % 5 == 0) ? "Coders" :
                                                                            n);

        }

    }
}
