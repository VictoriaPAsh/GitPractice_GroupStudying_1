package svetko.EmmaTasks.week_02;

public class DivisibleBy {

    public static void main(String[] args) {

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <=100 ; i++) {

            if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                divisibleBy15 += i + " ";
            }else if (i % 3 == 0){
                divisibleBy3 += i + " ";
            }else if (i % 5 ==0) {
                divisibleBy5 += i + " ";
            }


        }

        System.out.println("DivisibleBy15 = " + divisibleBy15);
        System.out.println("DivisibleBy5 = " + divisibleBy5);
        System.out.println("DivisibleBy3 = " + divisibleBy3);


    }
}
