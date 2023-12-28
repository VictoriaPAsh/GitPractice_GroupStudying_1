package TubishTasks.week05;

public class ReverseString {
//    String -- Reverse
//    Write a return method that can reverse String
//    Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {
        reverseString("ABCD");
    }
public static void reverseString(String str){
String reversed ="";
    for (int i = str.length()-1; i >=0; i--) {

        reversed+= str.charAt(i);

    }
    System.out.println(reversed);
}

}
