package TubishTasks.week08;

import java.util.Arrays;

public class NUniqueIntSumUpToZero {

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
public class SumToZeroArray {

    public static int[] generateArray(int N) {
        int[] array;
        if (N % 2 == 1) {
            array = new int[N];
            array[0] = 0;
            for (int i = 1; i <= N / 2; i++) {
                array[i] = i;
                array[N - i] = -i;
            }
        } else {
            array = new int[N];
            for (int i = 1; i <= N / 2; i++) {
                array[i - 1] = i;
                array[N - i] = -i;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] result = generateArray(N);
        System.out.println(Arrays.toString(result));
    }
}

}
