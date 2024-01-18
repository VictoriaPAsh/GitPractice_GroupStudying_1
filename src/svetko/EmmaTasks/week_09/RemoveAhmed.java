package svetko.EmmaTasks.week_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println("removedL = " + removedL(names));
        System.out.println("removedI = " + removedI(names));

    }

    public static ArrayList<String> removedL(ArrayList<String> names) {

        names.removeIf(p -> p.equals("Ahmed"));

        return names;
    }

    public static ArrayList<String> removedI(ArrayList<String> names) {

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {

            String each = it.next();

            if (each.equals("Ahmed")) {
                it.remove();
            }
        }
        return names;
    }
}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */