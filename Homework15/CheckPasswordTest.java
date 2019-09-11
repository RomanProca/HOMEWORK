package Homework15;

public class CheckPasswordTest {

    public static void main(String[] args) {


        CheckPassword checkPassword = new CheckPassword();
        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n");
        System.out.println(checkPassword.validatePassword("longPassword123"));
        System.out.println(checkPassword.validatePassword("password"));
        System.out.println(checkPassword.validatePassword("123"));

    }
}