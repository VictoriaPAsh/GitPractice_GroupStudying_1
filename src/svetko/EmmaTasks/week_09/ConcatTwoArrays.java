package svetko.EmmaTasks.week_09;

import java.util.Arrays;

public class ConcatTwoArrays {


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 7, 19, 9};
        int[] arr2 = {4, 9, 17, 18, 56};

        System.out.println(Arrays.toString(concatArr(arr1, arr2)));
       // System.out.println(Arrays.toString(concatArr2(arr1, arr2)));

    }

    public static int[] concatArr(int[] arr1, int[] arr2) {

        int[] mergedArr = new int[arr1.length + arr2.length];
        int index = 0;

        for (int each : arr1) {
            mergedArr[index++] = each;
        }

        for (int each2 : arr2) {
            mergedArr[index++] = each2;
        }

        return mergedArr;
    }

    public static int[] concatArr2(int[] arr1, int[] arr2) {

        int[] mergedArr = new int[arr1.length + arr2.length];
        int k =0;;

        for (int i = 0; i < arr1.length; i++,k++) {
            mergedArr[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) {
            mergedArr[k]=arr2[i];
        }

        return mergedArr;
    }

}
/*
Write a return method that can concate two arrays
 */