package svetko.InterviewTasks;

public class DivideWithoutSign {

    public static void main(String[] args) {


        int a = 3;  //4
        int b = 2;  // 20 = 20 -5 - 5 - 5-5 =0;

        System.out.println("divide = " + divide(a, b));


    }

    public static int divide(int a, int b) {

        int result = 0;
        int reminder = a % b;

        while (a >= b) {
            a = a - b;
            result++;
        }

        return result;
    }

}
