package EmmaTasks.GroupStudying.tubish;

public class Task7_Reverse_Negative_Num {

    public static void main(String[] args) {
        System.out.println(ReverseNegative(-5432));
    }

    public static int ReverseNegative(int n) {
        if (!(n <= 0)) {  // -5432  %10 == last digit. we have -2
            System.out.println(n + " is not a negative number");
        }
        String result = "";
        n = -n;
        result += "-";

        while (n >= 10) {
            result += n % 10;
            n /= 10;
        }
        String intReturn = result + n;
        int last = Integer.parseInt(intReturn);
        return last;
    }
    }
