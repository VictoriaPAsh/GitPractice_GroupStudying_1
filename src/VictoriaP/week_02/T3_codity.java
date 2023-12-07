package VictoriaP.week_02;

public class T3_codity {
    public static void main(String[] args) {
    codilityTest(60);
    }
    public static void codilityTest(int n){
        for (int i =1; i<=n; i++){
        if (i%5 == 0 && i%3== 0 && i%2 == 0){
            System.out.println("CodilityTestCoders");
        } else if ((i%2 ==0 && i%3 ==0) || (i%3 ==0 && i%5==0) || (i%2 ==0 && i%5 ==0)){
            System.out.println("CodilityTest");
        } else if (i%5==0) {
            System.out.println("Coders");
        } else if (i % 3 == 0) {
            System.out.println("Test");
        } else if (i%2==0) {
            System.out.println("Codility");
        } else {
            System.out.println(i);
        }
        }
    }
}
