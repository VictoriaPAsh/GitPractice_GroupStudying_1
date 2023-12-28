package svetko.EmmaTasks.week_06;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "Ab9@cdefg";

        System.out.println(isPasswordValid(password));

    }

    public static boolean isPasswordValid(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }


}
/*
    String -- Password Validation Task

    Write a return method that can verify if a password is valid or not. requirements:

                    1. Password MUST be at least have 6 characters and should not contain space
                    2. PassWord should at least contain one upper case letter
                    3. PassWord should at least contain one lowercase letter
                    4. Password should at least contain one special characters
                    5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false
 */