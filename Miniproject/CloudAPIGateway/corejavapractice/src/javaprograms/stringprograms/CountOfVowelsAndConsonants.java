package javaprograms.stringprograms;

public class CountOfVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Good Morning";
        printCountOfVowelsAndConsonants(str);

    }


    private static void printCountOfVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        String strLower = str.toLowerCase();
        for (int i = 0; i < strLower.length(); i++) {
            char ch = strLower.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("count of vowels:" + vowels);
        System.out.println("count of consonants:" + consonants);

    }
}
