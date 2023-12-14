package svetko.InterviewTasks;

import java.util.*;

public class RemoveDuplicates {


    public static void main(String[] args) {

        int[] arr = {3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3};

//        Set<Integer> removedDup = new LinkedHashSet<>();
//
//        for (int each : arr) {
//            removedDup.add(each);
//
//        }
//
//        int[] uniqueArr = new int[removedDup.size()];
//        int index = 0;
//
//        for (int each : removedDup) {
//
//            uniqueArr[index++] = each;
//
//        }
//
//        System.out.println(Arrays.toString(uniqueArr));

        ArrayList<Integer> remD = new ArrayList<>();
        for (int each : arr) {
            if (!remD.contains(each))
                remD.add(each);
        }
        System.out.println(remD);


    }


}
/*

  Remove Duplicates

        Create a method that will remove the duplicate values from an int array
        The returning array should only have one occurrence of each number

        Ex:
            Input:
                [3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3]
            Output:
                [3, 4, 5, 1, 2, 6]

 */