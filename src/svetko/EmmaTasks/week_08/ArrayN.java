package svetko.EmmaTasks.week_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayN {

    public static void main(String[] args) {

        int n = 5;

        System.out.println(Arrays.toString(sumUpNumbers(n)));

    }

    public static int[] sumUpNumbers(int n){

        List<Integer> numbers = new ArrayList<>();

        for (int i = -n / 2; i <= n / 2; i++) {

            if (i != 0) {
                numbers.add(i);
            } else if (n % 2 != 0) {
                numbers.add(i);
            }

        }

        int[] arr = new int[numbers.size()];
        int index = 0;

        for (Integer each : numbers) {

            arr[index++] = each;

        }

        return arr;
    }

}


/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
 */