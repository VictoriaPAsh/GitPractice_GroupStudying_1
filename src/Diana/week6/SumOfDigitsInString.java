package Diana.week6;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        System.out.println(sumDigits("13nsa3"));

    }


    public static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Integer.parseInt("" +ch);
            }

        }
        return sum;
    }

}

