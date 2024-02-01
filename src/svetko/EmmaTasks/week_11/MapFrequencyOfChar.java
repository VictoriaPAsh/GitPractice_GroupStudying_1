package svetko.EmmaTasks.week_11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfChar {


    public static void main(String[] args) {

        String str = "aaabbbbcccc";

        System.out.println(frequencyOfChar(str));


    }

    public static Map<String,Integer> frequencyOfChar(String str){

        String result ="";

        Map<String,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char each = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                char each2 = str.charAt(j);

                if(each == each2){
                    count++;
                }
            }

            if(result.contains(each+"")){
                continue;
            }

            result = each + "";

            map.put(result,count);
        }

       return map;
    }
}

/*
Map-- Frequency of Characters
Write a method that prints the frequency of each character from a String.
 */
