package svetko.EmmaTasks.week_07;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArraySortAscending {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        int[] sorted = sortAscending(arr);

        System.out.println(Arrays.toString(sortAscending2(arr)));

        System.out.println(Arrays.toString(sorted));
    }

    public static int[] sortAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }

        return arr;
    }


    public static int[] sortAscending2(int[] arr) {

        Set<Integer> setAscending = new TreeSet<>();

        for (int each : arr) {
            setAscending.add(each);
        }

        int[] ascendingArr = new int[setAscending.size()];
        int index = 0;

        for (Integer eachSet : setAscending) {
            ascendingArr[index++] = eachSet;


        }
        return ascendingArr;
    }

}
/*
Question2: Array - Sort Ascending

Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

            Ex: int[] arr = {10, 9, 8, 7};
            arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */