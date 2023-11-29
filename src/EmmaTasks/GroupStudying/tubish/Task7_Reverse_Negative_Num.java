package EmmaTasks.GroupStudying.tubish;

import java.util.Scanner;

public class Task7_Reverse_Negative_Num {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a negative number:");
        int num = in.nextInt();
        System.out.println(reverseNegativeNum(num));

        System.out.println(reverseNegative(num));
    }


    public static int reverseNegative(int n) {
        if (!(n <= 0)) {
            System.out.println(n + " is not a negative number");
        }
        String result = "-";
        n = -n;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return Integer.parseInt(result);
    }
    private static int reverseNegativeNum(int num) {
        if (!(num <= 0)) {
            System.out.println(num + " is not a negative number");
        }
        num = -num;
        String numS = String.valueOf(num);
        String reverse = "";
        for (int i = numS.length() - 1; i >= 0; i--) {
            reverse += numS.charAt(i);
        }
        num = Integer.parseInt(reverse);
        return -num;
    }
    }
