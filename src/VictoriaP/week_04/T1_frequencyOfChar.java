package VictoriaP.week_04;

public class T1_frequencyOfChar {
    public static void main(String[] args) {
        System.out.println(findFrequency("abbbss"));
        System.out.println(findFrequency("ABBBBSSSSLLDJVKJDKK"));
    }

    public static String findFrequency(String str) {
        //abbbbss -> a1b3s2
        /*
        count, String result "char"+count+"char"...
        nested loop -> char1, char2 -> if char1==char2 -> count++;
         */

        String result = "";
        for (int i = 0; i < str.length(); i++) { //took one character to compare it to other characterS
            char ch1 = str.charAt(i);
            int count = 0; //I want it to renew rach time when we compare new character
            for (int j = 0; j < str.length(); j++) { //loop for "other" characters
                char ch2 = str.charAt(j);
                if (ch1 == ch2) { //comparing
                    count++;
                }
            }
            if (result.contains(ch1+"")){ //no duplication in result
                continue;
            }
            result += ch1 + "" + count;
        }
        return result;
    }

}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */