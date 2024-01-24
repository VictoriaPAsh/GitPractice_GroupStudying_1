package TubishTasks.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAscendingAL {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method.
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 1, 4, 5));
        sortAsc(numbers);
    }

    public static void sortAsc(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
    }

}
