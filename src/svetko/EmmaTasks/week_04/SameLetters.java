package svetko.EmmaTasks.week_04;


import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";

        System.out.println(sameLetters(str1, str2));


    }

    public static boolean sameLetters(String str1, String str2) {

        boolean same = false;

        char[] arr = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);


        if (Arrays.equals(arr, arr2)) {
            same = true;
        }

        return same;


    }


}
/*
Write a return method that check if a string is build out of the
same letters as another string.

        Ex:
        same(" abc ",","cab"); --> true
        same("abc abb "); --> false
 */