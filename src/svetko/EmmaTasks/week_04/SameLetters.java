package svetko.EmmaTasks.week_04;


import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "bca";


        System.out.println(sameLetters(str1, str2));

        System.out.println(sameLetters2(str1, str2));


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

    public static boolean sameLetters2(String str1, String str2) {


        if(str1.length()!= str2.length()){
            return false;

        }

        boolean same = true;

        for (int i = 0; i < str2.length(); i++) {

            char each = str2.charAt(i);

            if (!(str1.contains("" + each))) {
                same = false;
                break;

            }


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