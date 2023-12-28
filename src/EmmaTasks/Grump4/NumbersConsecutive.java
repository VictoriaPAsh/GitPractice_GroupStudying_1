package EmmaTasks.Grump4;

public class NumbersConsecutive {
    public static void main(String[] args) {

    }

    public static void Consecutive (int num){
        for (int n = 1; n <= num; n++) {
            System.out.println(
                    (n % 2 == 0 && (n & 3) == 0 && n % 5 == 0) ? "CodilityTestCoders" :
                            (n % 2 == 0 && n % 3 == 0) ? "CodilityTest" :
                                    (n % 2 == 0 && n % 5 == 0) ? "CodilityCoders" :
                                            (n % 3 == 0 && n % 5 == 0) ? "TestCoders" :
                                                    (n % 2 == 0) ? "Codility" :
                                                            (n % 3 == 0) ? "Test" :
                                                                    (n % 5 == 0) ? "Coders" :
                                                                            Integer.toString(n));

        }

    }

}
