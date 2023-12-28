package VictoriaP.week_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T1_FindUnique {
    public static void main(String[] args) {

        System.out.println(findUniqueChars("AAABBBCCCDEF"));
        System.out.println(findUniqueChars("OLALAy"));
        System.out.println(findUniqueChars1("OLALAy"));
    }

    public static String findUniqueChars(String str){
        /*
        String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
         */

        String result = "";

        for(int i =0; i <str.length(); i++){
            int count = 0;
            for (int j = 0; j <str.length(); j++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                result+=str.charAt(i);
            }
        }
        return result;
    }
    public static String findUniqueChars1(String str){
        String result = "";
        String[] chars = str.split("");
        List<String> listOfChars = new ArrayList<>(Arrays.asList(chars));
        for (int i = 0; i < listOfChars.size(); i++) {
        if (Collections.frequency(listOfChars, listOfChars.get(i)) ==1){
            result+=listOfChars.get(i);
        }
        }
        return result;
    }

}
