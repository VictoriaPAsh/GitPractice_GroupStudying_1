package svetko.EmmaTasks.week_05;

import java.io.FilterOutputStream;

public class FindUnique {


    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";


        System.out.println("Unique characters: " + unique(str));


    }


    public static String unique(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {

                char each2 = str.charAt(j);


                if (each == each2) {
                    count++;
                }

            }


            if (count == 1) {
                result += each;
            }


        }

        return result;


    }


}
/*

    Write a return method that can find the unique characters from the String
                Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */