package svetko.EmmaTasks.week_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList_SortAscending {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(18, 10, 22, 1, 5, 19));

       // System.out.println(sortAscending(numbers));

        System.out.println(sortAscending2(numbers));

    }

    public static ArrayList<Integer> sortAscending(ArrayList<Integer> numbers) {

        Set<Integer> numbers2 = new TreeSet<>();

        for (Integer each : numbers) {
            numbers2.add(each);
        }

        numbers.clear();

        for (Integer each2 : numbers2) {
            numbers.add(each2);
        }

        return numbers;
    }

    public static ArrayList<Integer> sortAscending2(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.size() - 1; j++) {

                if (numbers.get(j) > numbers.get(j + 1)) {

                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        return numbers;
    }
}

/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
 */