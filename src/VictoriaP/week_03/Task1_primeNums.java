package VictoriaP.week_03;

public class Task1_primeNums {

    public static void main(String[] args) {
        System.out.println(primeOrNot(13));
        System.out.println(primeOrNot(10));
    }

    public static boolean primeOrNot(int num){
       if (num < 2 ){
           return false;
       }
       for (int i = 2; i < num; i++){
           if (num % i ==0){ //check each i. (if num % i == 0 true -> that means num can be divided not only by itself)
               return false;
           }
       }
       return true;
    }
}
