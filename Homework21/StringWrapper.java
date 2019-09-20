package Homework21;

public class StringWrapper {
    private String givenString;

    public StringWrapper(String givenString) {
        this.givenString = givenString;
    }

    public int getNumberOfConsonants() {
        System.out.println("StringWrapper.getNumberOfConsonants");
        //TODO add method to count number of consonants instead of returning half of the length
        return this.givenString.length() / 2;
    }

    public int getNumberOfVowels() {
        System.out.println("StringWrapper.getNumberOfVowels");
        //TODO add method to count number of vowels instead of returning half of the length
        return this.givenString.length() / 2;
    }

    public String toString() {
        return this.givenString;
    }

}
