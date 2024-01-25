package TubishTasks.week06;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigitsFromString {
//    String -- sum of digits in a string
//    Write a method that can return the sum of the digits in a string
public static void main(String[] args) {
    sumOfDigitsFromString("abc1d2e3f4g5h6");
}
    public static void sumOfDigitsFromString(String str) {
        int sum = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isDigit(each)) {
                list.add(each + "");
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum += Integer.parseInt(list.get(i));
        }
        System.out.println("sum = " + sum);
    }




}
