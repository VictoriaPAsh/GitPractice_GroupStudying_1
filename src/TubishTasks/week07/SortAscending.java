package TubishTasks.week07;

import java.util.Arrays;

public class SortAscending {
//
//    Question2: Array - Sort Ascending
//    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays
//
//    class
//    Ex: int[] arr = {10, 9, 8, 7};
//    arr = Sort(arr); ==>{ 7, 8, 9, 10};

    public static int[] sortAsc(int[]arr){
        int temp =0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAsc(new int [] {10, 9, 8, 7})));
    }


}
