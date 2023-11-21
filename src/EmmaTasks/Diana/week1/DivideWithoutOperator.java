package EmmaTasks.Diana.week1;

public class DivideWithoutOperator {

        public static void main(String[] args) {

            int num1 = 20;
            int num2 = 3;

            divide(num1,num2);
        }

        public static void divide(int n1, int n2){

            int remainder = n1 % n2;
            int result =0;

            while(n1>=n2){
                n1 = n1 - n2;
                result++;
            }
            System.out.println(result +"." +remainder);

        }

    }
