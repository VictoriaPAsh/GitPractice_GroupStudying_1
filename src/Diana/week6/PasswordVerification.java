package Diana.week6;

public class PasswordVerification {
    public static void main(String[] args) {

        System.out.println("isPasswordValid('Chatss128$') = " + isPasswordValid("Chatss128$"));
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
