package EmmaTasks.GroupStudying.tubish;

public class Task6_Consecutive_Nums {

    public static void main(String[] args) {
        consecutiveNums(17);
    }
    public static void consecutiveNums(int m) {

        for (int n = 1; n <= m; n++){
            if(n%2==0 && (n&3)==0 && n%5==0){
                System.out.println("CodilityTestCoders");
            }else if((n%2)==0&& (n%3)==0) {
                System.out.println("CodilityTest");
            }else if (n%2==0 && n%5==0){
                System.out.println("CodilityCoders");
            }else if(n%3==0 && n%5==0){
                System.out.println("TestCoders");
            }else if (n%2==0 ){
                System.out.println("Codility");
            }else if(n%3==0){
                System.out.println("Test");
            }else if(n%5==0){
                System.out.println("Coders");
            }else{
                System.out.println(n);
            }
        }
    }



/*Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number
divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than
one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this
given order. For example, numbers divisible by both 2 and 3 should be replacee by CodilityTest and numbers divisible by all
three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */


}
