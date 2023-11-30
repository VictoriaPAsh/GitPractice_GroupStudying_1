package VictoriaP.week_01;

public class Task2_divideWithout {
    public static void main(String[] args) {
        divide(20,5);
    }



    public static void divide(int n1, int n2){

        //20 = 5 + 5 + 5 + 5

        int count = 0;
        int reminder = n1 % 10;
        while (n1>=n2){
            n1 = n1 - n2;
            count++;
        }
        System.out.println(count + "," + reminder);

    }
}
