package TubishTasks.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
  /*  2) ArrayList - Remove "Ahmed"
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed */
  public static void removeName(ArrayList<String> names, String theName) {
      names.removeIf(name -> name.equals(theName));
  }

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(namesList);

        removeName(namesList, "Ahmed");

        System.out.println(namesList);
    }




}
