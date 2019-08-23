package Homework13;

class CountUppercaseLetters {
    String calculateUppercaseLetters(String uppercase ,int upperCaseCount) {
        System.out.println();
        for (int i=0; i<uppercase.length(); i++){
            for(char c='A'; c<='Z'; c++){
                if (uppercase.charAt(i) == c)
                {
                    upperCaseCount++;
                }

            }
        }
        return "Enter a string:"+" "+uppercase+" \n"+"The number of uppercase letters is"+" "+upperCaseCount;
    }
}
