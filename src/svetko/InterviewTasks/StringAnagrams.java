package svetko.InterviewTasks;

import java.util.Arrays;

public class StringAnagrams {


    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        anagrams1(str1, str2);
        anagram2(str1, str2);


    }


    public static void anagrams1(String str1, String str2) {

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Words are anagrams");
        } else {
            System.out.println("Words are NOT anagrams");
        }

    }

    public static void anagram2(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Words are NOT anagrams");
            return;
        }

        boolean same = true;

        for (int i = 0; i < str2.length(); i++) {

            char each = str2.charAt(i);

            if (!(str1.contains("" + each))) {
                same = false;
                break;

            }

        }

        if (same == true) {
            System.out.println("Words are anagrams");
        } else {
            System.out.println("Words are NOT anagrams");
        }


    }


}
