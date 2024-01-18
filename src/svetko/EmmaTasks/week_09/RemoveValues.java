package svetko.EmmaTasks.week_09;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveValues {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 500; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);
        System.out.println("-----------------------------------");

        System.out.println("removeL = " + removeL(numbers));
        System.out.println("removeI = " + removeI(numbers));

    }

    public static ArrayList<Integer> removeL(ArrayList<Integer> numbers) {

        numbers.removeIf(p -> p > 100);

        return numbers;
    }

    public static ArrayList<Integer> removeI(ArrayList<Integer> numbers) {

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {

            Integer each = it.next();

            if (each > 100) {
                it.remove();
            }
        }
        return numbers;
    }
}
/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */