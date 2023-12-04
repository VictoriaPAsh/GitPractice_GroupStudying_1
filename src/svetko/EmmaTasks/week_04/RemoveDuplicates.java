package svetko.EmmaTasks.week_04;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";


        System.out.println(removeDuplicates(str));

        System.out.println("-------------------------------------");


        System.out.println(removeDuplicates2(str));


    }


    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (result.contains("" + each)) {
                continue;
            }

            result += each;


        }
        return result;


    }

    public static String removeDuplicates2(String str) {

        String[] arr = str.split("");

        String result2 = "";


        Set<String> removeDuplicates = new LinkedHashSet<>();
        removeDuplicates.addAll(Arrays.asList(arr));


        for (String each : removeDuplicates) {
            result2 += each;
        }


        return result2;

    }


}
/*
Write a return method that can remove the duplicated values from String

        Ex:
            removeDup (" AAABBBCCC")==> ABC
 */