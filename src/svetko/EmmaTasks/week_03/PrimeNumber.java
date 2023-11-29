package svetko.EmmaTasks.week_03;

public class PrimeNumber {

    public static void main(String[] args) {


        System.out.println(isPrime(9));
        System.out.println(isPrime(18));
        System.out.println(isPrime(35));
        System.out.println(isPrime(4));


    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }

        }

        return true;


    }


}
