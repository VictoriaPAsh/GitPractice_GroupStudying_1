package svetko.EmmaTasks.week_08;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};


      //  System.out.println(Arrays.toString(moveZerosToEnd(arr)));

        System.out.println(Arrays.toString(moveZerosToEnd2(arr)));

    }

    public static int[] moveZerosToEnd(int[] arr) {

        int[] endZeros = new int[arr.length];
        int index = 0;

        for (int each : arr) {

            if (each > 0) {
                endZeros[index++] = each;
            }
        }
        return endZeros;

    }

    public static int[] moveZerosToEnd2(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
       return arr;
    }
}
/*
    Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array
    (Do Not Use Sort Method)

            Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,0]
 */