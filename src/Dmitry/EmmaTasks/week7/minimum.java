package Dmitry.EmmaTasks.week7;

import static java.util.Arrays.sort;

public class minimum {
    public static void main(String[] args) {
        int intArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(minNumber1(intArr));
        System.out.println(minNumber2(intArr));

    }

    public static int minNumber1(int[] arr) {
        int maxNumber = arr[0];
        for (int each : arr) {
            if (each < maxNumber) {
                maxNumber = each;
            }
        }
        return maxNumber;
    }

    public static int minNumber2(int[] arr) {
        sort(arr);
        int lengthArr = arr.length;
        return arr[0];
    }
}
