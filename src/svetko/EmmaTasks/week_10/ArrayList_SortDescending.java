package svetko.EmmaTasks.week_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList_SortDescending {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(18, 10, 22, 1, 5, 19));

        System.out.println(sortDescending(numbers));
        //System.out.println(sortDescending2(numbers));

    }

   public static ArrayList<Integer> sortDescending(ArrayList<Integer> numbers){

       Set<Integer> sorted = new TreeSet<>();

       for (Integer each : numbers) {
           sorted.add(each);
       }

       numbers.clear();

       for (Integer each2 : sorted) {
           numbers.add(each2);
       }

       ArrayList<Integer> reversed = new ArrayList<>();

       for (int i = numbers.size()-1; i >=0; i--) {
           reversed.add(numbers.get(i));
       }
       return reversed;
   }

    public static ArrayList<Integer> sortDescending2(ArrayList<Integer> numbers){

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.size()-1; j++) {

                if(numbers.get(j) < numbers.get(j+1)){

                    int temp = numbers.get(j);
                    numbers.set(j,numbers.get(j+1));
                    numbers.set(j+1,temp);

                }
            }
        }
        return numbers;
    }
}
/*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
 */