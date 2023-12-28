package EmmaTasks.Grump4;

public class WithoutDivision {
    public static void main(String[] args) {

        int num1 =-2000;
        int num2 = 50;

        divide(num1, num2);
    }

    public static void divide(int n1, int n2) {

        // 5*4 =20 --> 5+5+5+5 = 20
        // 20 = 20-5-5-5-5 = 0
        // n1=20 n2=3 6.6666


        int result = 0;
        if (n1 == 0 || n2 == 0) {
            System.out.println("You cannot divide by zero or you cannot divide zero my dude");
        }
        else {
            if (n1>n2) {
                while (n1 >= n2) {
                    n1 = n1 - n2;
                    result++;
                }
                System.out.println("Result is = " + result);
            } else if (n1>n2){
                while (n2 >= n1) {
                    n2 = n2 - n1;
                    result++;
                }
                System.out.println("Result is = " + result);
            }

        }

    }

}
