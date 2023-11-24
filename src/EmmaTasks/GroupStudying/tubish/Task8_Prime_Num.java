package EmmaTasks.GroupStudying.tubish;

public class Task8_Prime_Num {



    public static void primeNum(int n){
        if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0){
            System.out.println("number " + n + " is a prime number");
        }else{System.out.println("number " + n + " is not a prime number");}

    }

    public static void main(String[] args) {
        primeNum(75);
        primeNum(51);
        primeNum(53);
    }
}
