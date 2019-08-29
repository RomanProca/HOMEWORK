package Homework15;

public class CheckPassword {

    public static void main(String[] args) {


        CheckPasswordData checkPasswordData = new CheckPasswordData();
        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n");
        System.out.println(checkPasswordData.validatePassword("longPassword123"));
        System.out.println(checkPasswordData.validatePassword("password"));
        System.out.println(checkPasswordData.validatePassword("123"));

    }
}