package EmmaTasks.svetko.week_02;

public class SwapNumbers {

    public static void main(String[] args) {

        int x = 15;
        int y = 20;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
/*
Swap two variables without using third variable
 */