package svetko.EmmaTasks.week_07;

public class ArrayFindMinimum {

    public static void main(String[] args) {

        int[] arr = {-1, 3, 8, 7, 4, 9, 5, 7};

        minimumArray(arr);


    }

    public static void minimumArray(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("min = " + min);

    }


}
 /*
    Question1: Array - Find Minimum

Write a method that can find the maximum number from an int Array
     */