package svetko.EmmaTasks.week_06;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        String str = "java4a5gh7gf8fvn1nh5h4";

        sumOfDigits(str);

    }

    public static void sumOfDigits(String str){

        int sum = 0;

        List<String> list = new ArrayList<>();

        for (int i=0; i <str.length() ; i++) {

            char each = str.charAt(i);

            if(Character.isDigit(each)){
                list.add(each + "");
            }

        }

        for (int i = 0; i < list.size(); i++) {

            sum+=Integer.parseInt(list.get(i));;
        }

        System.out.println("sum = " + sum);


    }



}
/*

Write a method that can return the sum of the digits in a string


 */

