package TubishTasks.week10;

import java.util.*;

public class SortByValuesMap {
//    Write a method that can sort the Map by values.

    public static void main(String[] args) {

        Map<String, Integer> newMap = new HashMap<>(); //random order, faster
        newMap.put("entry1", 5);
        newMap.put("entry2", 3);
        newMap.put("entry3", 8);
        newMap.put("entry4", 1);
        
        sortByValues(newMap);
    }
    private static void sortByValues(Map<String, Integer> map) {
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getValue() > list.get(j + 1).getValue()) {

                    Map.Entry<String, Integer> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        Map<String, Integer> sortedMap = new LinkedHashMap<>(); //to keep insertion order
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMap);
    }
}


