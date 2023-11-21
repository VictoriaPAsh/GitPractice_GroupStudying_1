package svetko.EmmaTasks.week_01;

public class Task2_DivideWithout {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 3;

        divide(num1,num2);
    }

    public static void divide(int n1, int n2){

        // 5*4 =20 --> 5+5+5+5 = 20
        // 20 = 20-5-5-5-5 = 0
        // n1=20 n2=3 6.6666

        int remainder = n1 % n2;
        int result =0;

        while(n1>=n2){
            n1 = n1 - n2;
            result++;
        }
        System.out.println(result +"." +remainder);

    }

}
