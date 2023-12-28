package svetko.EmmaTasks.week_04;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDD";

        System.out.println(frequencyOfCharacters(str));


    }

    public static String frequencyOfCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each2 = str.charAt(j);

                if (each == each2) {
                    count++;
                }

            }

            if (result.contains("" + each)) {
                continue;
            }

            result += each + "" + count;


        }

        return result;


    }


}
/*
    Write a return method that can find the frequency of
    characters
            Ex:
            FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
 */