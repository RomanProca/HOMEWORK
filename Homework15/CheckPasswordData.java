package Homework15;

class CheckPasswordData {
    private static final int PASSWORD_LENGTH = 8;

    String validatePassword(String password) {
        int numCount = 0;
        int charCount = 0;
        if (password.length() < PASSWORD_LENGTH) return "Not a valid password: " + password;


        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return "Not a valid password: " + password;
        }


        return "Password is valid: " + password;
    }

    private static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    private static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }


}
