package svetko.EmmaTasks.week_06;

public class ArrayFindMaximum {

    public static void main(String[] args) {

        int[] arr = {3, 59, 14, 3, 4, 9, 7, 18};

        arrayMax(arr);

    }

    public static void arrayMax(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("Maximum number is: " + max);

    }


}
/*
Write a method that can find the maximum number from an int Array


 */