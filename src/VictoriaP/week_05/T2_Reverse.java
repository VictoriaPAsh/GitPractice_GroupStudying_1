package VictoriaP.week_05;

public class T2_Reverse {
    public static void main(String[] args) {
        String str = "Hawaii";
        System.out.println(reverseStr("Alaska"));
        reverseStr1(str);
    }

    public static String reverseStr(String str){
      String result ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
      return result;
    }
    public static void reverseStr1 (String str){
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
