package VictoriaP.week_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T2_sameLetters_Important {
    public static void main(String[] args) {
        System.out.println(isBasedOn2("biba", "abib"));
        System.out.println(isBasedOn2("boba", "abib"));
    }

    public static boolean isBasedOn(String str1, String str2) {
        // biba -> babi or abib -> true
        // boba -> bibo -> false
        /*
        compare frequency of the letters -> return result;
        OR sort and compare strings -> return result
         */
        boolean result = false;
        if (!(str1.length() == str2.length())) {
            return result;
        }
        List<Character> characters1 = new ArrayList<>();
        List<Character> characters2 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            characters1.add(str1.charAt(i));
            characters2.add(str2.charAt(i));
        }
        Collections.sort(characters1);
        Collections.sort(characters2);
        if (characters1.equals(characters2)) {
            result = true;
        }
        return result;
    }

    public static boolean isBasedOn2(String str1, String str2) {
        boolean result = false;
        if (!(str1.length() == str2.length())) {
            return result;
        }
        List<Character> characters1 = new ArrayList<>();
        List<Character> characters2 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            characters1.add(str1.charAt(i));
            characters2.add(str2.charAt(i));
        }
        Collections.sort(characters1);
        Collections.sort(characters2);
        for (int i =0; i<characters1.size(); i++){
            int frequency1 = Collections.frequency(characters1, characters1.get(i));
            int frequency2 = Collections.frequency(characters2, characters2.get(i));
            if(frequency1==frequency2){
                result = true;
            }
        }
        return result;
    }
}

/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */