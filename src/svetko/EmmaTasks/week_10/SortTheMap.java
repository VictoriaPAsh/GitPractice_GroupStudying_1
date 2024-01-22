package svetko.EmmaTasks.week_10;

import java.util.*;

public class SortTheMap{

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("N1", 18);
        map.put("N2", 9);
        map.put("N3", 5);
        map.put("N4", 22);
        map.put("N5", 19);
        map.put("N6", 3);

        System.out.println("Unsorted = " + map);


        List<Integer> numbers = new ArrayList<>();
        List<String> keys = new ArrayList<>();

        for (String eachKey : map.keySet()) {
            keys.add(eachKey);
        }


        for (Integer eachValue : map.values()) {
            numbers.add(eachValue);
        }

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.size() - 1; j++) {

                if (numbers.get(j) > numbers.get(j + 1)) {

                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);

                }
            }
        }

        map.clear();

        for (int i = 0; i < numbers.size(); i++) {

           map.put(keys.get(i),numbers.get(i));

        }


        System.out.println("Sorted map = " + map);


    }
}






