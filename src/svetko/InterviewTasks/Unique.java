package svetko.InterviewTasks;

public class Unique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char each = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each2 = str.charAt(j);
                if (each == each2) {
                    count++;

                }

            }

            if (count == 1) {
                unique += each;
            }


        }
        System.out.println("unique = " + unique);


    }
}
