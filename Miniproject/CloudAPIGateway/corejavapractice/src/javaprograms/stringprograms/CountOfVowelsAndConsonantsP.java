package javaprograms.stringprograms;

public class CountOfVowelsAndConsonantsP {
    public static void main(String[] args) {
        String str = "Good Morning";
        printCountOfVowelsAndConsonants(str);

    }

    private static void printCountOfVowelsAndConsonants(String str) {
        String s1 = str.replaceAll("\\s", "");
        int vowels = 0;
        int consonants = 0;
        String strLower = s1.toLowerCase();
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
        System.out.println("vowels count: " + vowels);
        System.out.println("consonant count: " + consonants);
    }
}
