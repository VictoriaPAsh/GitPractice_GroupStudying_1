package svetko.EmmaTasks.week_05;


public class ReverseString {

    public static void main(String[] args) {

        String str = "ABCD";

        System.out.println("Reversed: " + reverse(str));

    }

    public static String reverse(String str) {

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {

            char each = str.charAt(i);

            reversed += each;


        }

        return reversed;


    }


}
/*

    Write a return method that can reverse String
                Ex: Reverse("ABCD"); ==> DCBA
 */