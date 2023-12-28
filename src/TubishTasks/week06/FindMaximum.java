package TubishTasks.week06;

public class FindMaximum {


//    Array -- Find Maximum
//    Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        System.out.println(maxNum(new int[]{5, 1, 5, -1, 5}));
    }
    public static int maxNum(int[] arr){

        int max = Integer.MIN_VALUE;
        for (int each : arr) {
            if(each>max){
                max=each;
            }
        }return max;
    }
}
