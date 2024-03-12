package svetko.InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {


    public static void main(String[] args) {

        int num = 8;

        System.out.println("fibonacci = " + fibonacci(num));

    }

    public static int fibonacci(int num){

        List<Integer> list = new ArrayList<>(Arrays.asList(0,1));


        for (int i = 1; i < num ; i++) {

            int num1 = list.get(list.size()-2);
            int num2 =list.get(list.size()-1);

            list.add(num1+num2);
        }

        System.out.println("list = " + list);

        return list.get(list.size()-1);
    }








}
