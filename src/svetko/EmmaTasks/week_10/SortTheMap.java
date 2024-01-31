package svetko.EmmaTasks.week_10;

import java.util.*;

public class SortTheMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("N1", 18);
        map.put("N2", 9);
        map.put("N3", 5);
        map.put("N4", 22);
        map.put("N5", 19);
        map.put("N6", 3);

        System.out.println("Unsorted = " + map);
        System.out.println();

       System.out.println("Sorted 1 = " + sortByValue(map));
       // System.out.println("Sorted 2 = " + sortByValue2(map));


    }


    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>();

        for (Map.Entry<String, Integer> eachSet : map.entrySet()) {
            list.add(eachSet);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size() - 1; j++) {

                if (list.get(j).getValue() > list.get(j + 1).getValue()) {

                    Map.Entry<String, Integer> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        map.clear();

        for (Map.Entry<String, Integer> eachSet : list) {
            map.put(eachSet.getKey(), eachSet.getValue());
        }

        return map;
    }

    public static Map<String, Integer> sortByValue2(Map<String, Integer> map) {

        List<Integer> values = new ArrayList<>();
        List<String> keys = new ArrayList<>();

        for (String eachKey : map.keySet()) {
            keys.add(eachKey);
        }

        for (Integer eachValue : map.values()) {
            values.add(eachValue);
        }

        for (int i = 0; i < values.size(); i++) {

            for (int j = 0; j < values.size() - 1; j++) {

                if (values.get(j) > values.get(j + 1)) {

                    int temp = values.get(j);
                    values.set(j, values.get(j + 1));
                    values.set(j + 1, temp);
                }
            }
        }
        map.clear();

        for (int i = 0; i < values.size(); i++) {

            map.put(keys.get(i), values.get(i));

        }
        return map;
    }
}









