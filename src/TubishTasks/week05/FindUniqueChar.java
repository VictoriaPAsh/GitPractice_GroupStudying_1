package TubishTasks.week05;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindUniqueChar {
//    String -- Find the unique
//    Write a return method that can find the unique characters from the String
//    Ex: unique("AAABBBCCCDEF") ==> "DEF";
public static void main(String[] args) {
    findUniqueChar("AAABBBCCCDEF");
}

    public static void findUniqueChar(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            if(frequency == 1)
                map. put(each.charAt(0), frequency);
        }
        System.out.println(map);
    }
    }

