package EmmaTasks.svetko.week_03;


public class ReverseNegativeNumber {

    public static void main(String[] args) {


        int number = -52;

        System.out.println(reverseNegativeNumber(number));


    }

    public static int reverseNegativeNumber(int number) {

        if (number >= 0) {
            System.err.println(number + " is not a negative number");
            throw new RuntimeException();
        }

        int reversed = 0;

        while (number < 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;


        }

        return reversed;


    }


}
