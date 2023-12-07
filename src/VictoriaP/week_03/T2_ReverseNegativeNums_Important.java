package VictoriaP.week_03;

public class T2_ReverseNegativeNums_Important {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNum(-2534));
        System.out.println(ReverseNeg2(-253));

    }
    public static int reverseNegativeNum(int n){
        /* -25 ->52
        take each int from end (n%10) -> Delete n/10 (I want to take another int) -> 253 -> 3 -> 253/10(25) -> 25%10 ->5
        -25 -> 25
        25%10 --> 5;
        25/10 --> 2
        String +=5 + 2 --> parseInt(String);
        253 -> 352
        1234 -> 4321
         */
        if(n>=0){
            System.err.println("Number is not negative " + n) ;
            System.exit(0);
        }
        n = -n; // return me positive num
        String result = "";
        //253
        while(n>0){
            result +=n%10; //--> adding int one by one from the end
            n/=10;
        }
        return Integer.parseInt(result);
    }
    public static int ReverseNeg2(int n){
        //253 -> 325
        /*
        String -> 253 -> reverse String -> 352
         */
        if(n>=0){
            System.err.println("Number is not negative " + n);
            System.exit(0);
        }
        n = -n; // made it positive
        String  num = String.valueOf(n); //253
        String reversed = "";
        for(int i = num.length()-1; i>=0; i--){
            reversed += num.charAt(i);
        }
        int result = Integer.parseInt(reversed);
        return result;
    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */