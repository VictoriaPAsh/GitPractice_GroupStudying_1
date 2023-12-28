package EmmaTasks.Grump4;

public class SwampNumbers {
    public static void main(String[] args) {
        int a= 5;
        int b= 1;
        System.out.println("Before");
        System.out.println(a);
        System.out.println(b);
//        a=a^b;
//        b=a^b;        another method
//        a=a^b;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After");
        System.out.println(a);
        System.out.println(b);



    }
}
