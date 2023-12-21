package svetko.InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed","Ahmed","Ahmed", "John", "Eric", "Ahmed"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {

            String each = it.next();

            if (each.equalsIgnoreCase("Ahmed")) {
                it.remove();
            }

        }

        System.out.println(names);


    }
}
/*

  Remove Ahmed

        Create a method that will accept a List of names and return the List with all the Ahmed names removed
            parameter: List<String>
            return: List<String>

        Ex:
            input:
                removeAhmed("Ahmed", "John", "Eric", "Ahmed")
            output:
                [John, Eric]
 */