package VictoriaP.week_02;

public class T1_SwapNumbers {
    /*
    swap nus without using third variable
     */
    public static void main(String[] args) {
        swapNums(10, 5);
        swapNums(15, 35);
    }
    public static void swapNums(int x, int y){
        System.out.println(x + " : " + y);
        // 10, 5 --> x = 10+ 5 -> y = 15-5 -> x = 15-10
        x = x + y; //15
        y = x - y; //10
        x = x - y; //5
        System.out.println(x + ": " + y);
    }
}
