package TubishTasks.week08;

import java.util.Arrays;

public class MoveZerosToEnd {
/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
 */
public static void main(String[] args) {
    System.out.println(Arrays.toString(moveZeros(new int[]{5, 0, 2, 0, 0, 1, 0, 23})));

}
    public static int[] moveZeros(int[]arr){
        int moved [] = new int[arr.length];
        int index=0;
        for (int each : arr) {
            if (each!=0){
                moved[index++]=each;
            }
        }
        return moved;
    }

    }

