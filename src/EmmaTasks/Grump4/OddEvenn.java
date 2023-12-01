package EmmaTasks.Grump4;

public class OddEvenn {
    public static void main(String[] args) {
        System.out.println(oddEven(5));
    }

    public static String oddEven(int num ){
        if(num % 2 ==0 ) {
            return "Even";
        }
        {
            return "Odd";
        }

    }

}
