package Dmitry.EmmaTasks.week7;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int intArr [] = {1,20,3,4,50,6,7,8,9};
        descendingOrder(intArr);
    }
    public static void descendingOrder (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void descendingOrder1 (int[] arr){
        Arrays.sort(arr);
        int[] arr2;
        for (int each : arr){

        }
    }
}

