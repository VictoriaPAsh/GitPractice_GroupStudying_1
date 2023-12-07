package VictoriaP.week_04;

public class T3_removeDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAAABBBBSSSS"));
    }
    public static String removeDup(String str) {
        //abbbbss -> a1b3s2
        /*
        count, String result "char"+count+"char"...
        nested loop -> char1, char2 -> if char1==char2 -> count++;
         */

        String result = "";
        for (int i = 0; i < str.length(); i++) { //took one character to compare it to other characterS
            char ch1 = str.charAt(i);
            if (result.contains(ch1+"")){ //no duplication in result
                continue;
            }
            result += ch1 + "";
        }
        return result;
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */