package Homework13;

class CountUppercaseLetters {
    String calculateUppercaseLetters(String uppercase) {
        System.out.println();
        int upperCaseCount = 0;
        for (int i = 0; i < uppercase.length(); i++){
            for(char c = 'A'; c <= 'Z'; c++){
                if (uppercase.charAt(i) == c)
                    upperCaseCount++;
            }
        }
        return String.format("Enter a string: %s \n" +
                "The number of uppercase letters is %d", uppercase, upperCaseCount);
    }
}
