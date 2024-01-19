package TubishTasks.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {
  /*  3) ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.   */

    public class RemoveValuesGreaterThan100 {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

            removeIfGreaterThan100(list);
        }

        public static void removeIfGreaterThan100(List<Integer> list) {
            List<Integer> filteredList = new ArrayList<>();
            for (Integer value : list) {
                if (value <= 100) {
                    filteredList.add(value);
                }
            }

            System.out.println(filteredList);
        }
    }
}


