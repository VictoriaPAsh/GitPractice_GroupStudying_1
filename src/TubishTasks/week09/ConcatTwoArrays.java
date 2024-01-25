package TubishTasks.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatTwoArrays {
   /* 1) Array - Concat two arrays
    Write a return method that can concate two arrays

    Input:
            [1, 4, 5], [8, 12, 5, 9]
    Output:
            [1, 4, 5, 8, 12, 5, 9]
            */
    public static int[] concatArray(int[]arr1, int[] arr2) {

        int[] newArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i] += arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            newArray[arr1.length + j] += arr2[j];
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatArray(new int[]{1, 4, 5}, new int[]{8, 12, 5, 9})));
    }
}


