package TubishTasks.week07;

public class FindMinimum {
    //    Question1: Array - Find Minimum
//    Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {

        System.out.println(minNum(new int[]{3, 5, 1, 5, -1, 5}));

    }
    public static int minNum(int[] arr){
        int min = arr[0]; // Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }return min;
    }





}
