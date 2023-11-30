package VictoriaP.week_01;

public class Task1 {


    public static void main(String[] args) {
        System.out.println(oddOrEven(23));
    }
//Odd or even
public static String oddOrEven(int num){
    String result = "";

    result = (num % 2==0)? "even" : "odd";
    return result;

}



}
