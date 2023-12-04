package TubishTasks.week04;

import java.util.*;

public class Task9_FrequencyOfChar {
    /*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void frequencyOfCharacter(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each, frequency);
        }
        String result = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result += entry.getKey() + entry.getValue();
        }

        System.out.println(result);
    }

    public static void frequencyOfChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i) + count;
            }
        }
        System.out.println(result);
    }

    public static void freqOfChar(String str) {
        ArrayList<Character> listOfChars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            listOfChars.add(str.charAt(i));
        }
        int eachFreq = 0;
        String result = "";
        for (int i = 0; i < listOfChars.size(); i++) {
            eachFreq = 0;
            for (int j = 0; j < listOfChars.size(); j++) {
                eachFreq = Collections.frequency(listOfChars, str.charAt(i));
            }
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i) + eachFreq;
            }
        }
        System.out.println("result = " + result);
    }


    public static void main(String[] args) {

        frequencyOfCharacter("AAABBCDD");
        frequencyOfChar("AAABBCDD");
        freqOfChar("AAABBCDD");

    }
}