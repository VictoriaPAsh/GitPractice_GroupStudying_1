package TubishTasks.week06;

public class PasswordValidationMethod {
//    String -- Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//    requirements:
//            1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns false

    public static void main(String[] args) {

        boolean isValid = isValidPassword("a1s2d3f4g5[");
        System.out.println("Is the password valid? " + isValid);
    }

    public static boolean isValidPassword(String password) {
        // Check if the password length is at least 6 characters and does not contain spaces

        // Check if the password contains at least one uppercase letter, one lowercase letter, one digit, and one special character


        // If all requirements are met, return true

        return true;
    }
}
