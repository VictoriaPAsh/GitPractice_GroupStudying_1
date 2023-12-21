package Diana.week6;

public class FinMaxNum {
    public static void main(String[] args) {

        int [] arr={0,1,4,8,-2,9} ;
        System.out.println("maxNum(arr) = " + maxNum(arr));
    }

    public static int maxNum(int[] arr){
        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
}
