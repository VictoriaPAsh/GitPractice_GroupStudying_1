package TubishTasks.week04;

import java.util.ArrayList;
import java.util.Collections;

public class Task10_SameLetters {
    /*String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */
    public static void main(String[] args) {
        System.out.println("sameLetter(\"abcc\",\"abcd\") = " + sameLetter("abcc", "abcdb"));
    }
    public static boolean sameLetter(String str1, String str2) {

        if (str1.length() != str2.length()) {
         return false;
        }
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for(int i=0; i<str1.length(); i++){
             list1.add(str1.charAt(i));
             list2.add(str2.charAt(i));
         }
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
