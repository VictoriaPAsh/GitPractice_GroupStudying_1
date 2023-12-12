package svetko.InterviewTasks;


import java.util.Arrays;

public class SumNumbersInString {

    public static void main(String[] args) {

        String str = "jav45ai15sgre1at82";

        int sum = 0;
        String num = "";


        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (Character.isDigit(each)) {
                num += each;

                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(num);
                    num = "";
                }


            }


        }
        System.out.println("sum = " + sum);


    }


}
/*
Create a program that will take any String and print the total sum of all the numbers in the
String.
        Note: numbers can be more than digits from 1-9 so if you have “14” next to each other it
        should be considered 14 and not 1 and 4 separate:

String str = "jav45ai15sgre1at82" ;

 */