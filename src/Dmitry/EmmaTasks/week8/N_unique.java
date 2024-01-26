package Dmitry.EmmaTasks.week8;

public class N_unique {
    public static void main(String[] args) {

        System.out.println("sumZeroArray1(5) = " + sumZeroArray1(5));
    }



    public static int[] sumZeroArray1(int n){

        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            arr[i] = i+1;
            sum = sum + arr[i];
        }
        arr[n-1] = (-sum);
        return arr;
    }
}
