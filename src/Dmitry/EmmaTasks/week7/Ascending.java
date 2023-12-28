package Dmitry.EmmaTasks.week7;

import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        int intArr [] = {1,20,3,4,50,6,7,8,9};
        System.out.println(Arrays.toString(intArr));
        ascendingOrder(intArr);
    }

    public static void ascendingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void ascendingOrder1 ( int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

