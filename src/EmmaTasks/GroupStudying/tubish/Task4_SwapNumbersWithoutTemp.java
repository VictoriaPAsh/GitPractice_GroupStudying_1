package EmmaTasks.GroupStudying.tubish;

public class Task4_SwapNumbersWithoutTemp {

    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        System.out.println("Before");
        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After");
        System.out.println(a);
        System.out.println(b);


//  second solution
//        a=a^b;
//        b=a^b;
//        a=a^b;
    }
}
