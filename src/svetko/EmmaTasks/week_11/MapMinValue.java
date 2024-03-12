package svetko.EmmaTasks.week_11;

import java.util.*;

public class MapMinValue {


    public static void main(String[] args) {

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("N1",18);
        map.put("N2",18);
        map.put("N3",25);
        map.put("N4",5);
        map.put("N5",10);
        map.put("N6",3);

        int minValue = minMapValue(map);

       // System.out.println("minValue = " + minValue);

        System.out.println("Collections.min(map.values()) = " + Collections.min(map.values()));

    }


    public static int minMapValue(Map<String,Integer> map){

        Integer min = null;

        for (Integer value : map.values()) {

            if(min == null || min > value){
                min=value;
            }

        }
        return min;
    }
}
/*
Map - Min value
Write a method that can return the minimum value from a map (DO NOT
use sort method).
 */