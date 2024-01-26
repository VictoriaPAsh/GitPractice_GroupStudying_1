package Dmitry.EmmaTasks.week8;

public class moveZerosToTheEnd {
    public static void main(String[] args) {
        int arr1[] =  {2,5,4,0,6,5,0,0,6,43,5,6,70,4,0};
        moveToEnd(arr1);

            
        }


    public static int[] moveToEnd(int arr[]){
        int n = arr.length;
        int nonZero = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                arr[nonZero++] = arr[i];
            }
        }
        while (nonZero<n){
            arr[nonZero++] = 0;;
        }

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);

        }
        return arr;
    }
}
