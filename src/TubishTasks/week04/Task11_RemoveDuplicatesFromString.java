package TubishTasks.week04;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task11_RemoveDuplicatesFromString {
    /*
  String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        System.out.println("removeDuplicates(\"AAABBBCCC\") = " + removeDuplicatesFromString("AAABBBCCC"));
    }
    public static String removeDuplicatesFromString(String str){
       String result ="";
        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
