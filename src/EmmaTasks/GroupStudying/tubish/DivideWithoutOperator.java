package EmmaTasks.GroupStudying.tubish;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        tugbaDivide(20,3);
    }
    public static void tugbaDivide(int n1, int n2){

        // 6* =20 --> 3+3+3+3+3+3 = 20
        // 20 = 20-3-3-3-3-3-3 = 2

        int result =0;

        if(n1>0 && n2>0) {
            if (n1 > n2) {
                while (n1 >= n2) {     //20    //17    //14    //11   //8   //5    //2
                    n1 = n1 - n2; //20-17 //17-14 //14-11 //11-8 //8-5 //5-2
                    result++;    //1     //2     //3     //4    //5   //6
                }

            }else if(n2 > n1) {
                while (n2 >= n1) {     //20    //17    //14    //11   //8   //5    //2
                    n2 = n2 - n1; //20-17 //17-14 //14-11 //11-8 //8-5 //5-2
                    result++;    //1     //2     //3     //4    //5   //6
                }
            }
        }
        System.out.println(result); // 6
    }
}
