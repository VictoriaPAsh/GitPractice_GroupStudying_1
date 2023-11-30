package TubishTasks;

public class Task2_OddOrEven {
    public static void main(String[] args) {
        System.out.println("tugbaOddOrEven(11) = " + tugbaOddOrEven(10));
    }
    public static String tugbaOddOrEven(int num){
        String result = "";
        return num%2==1 ? "odd" : "even";
    }
}
