package javaprograms.stringprograms;

import static java.util.Arrays.sort;

public class CheckStringAnagram {
    public static void main(String[] args) {
        String s1 = "cinema";
        String s2 = "silent";
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        if (s1.length() != s2.length()) {
            System.out.println("strings are not anagrams");
        } else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            sort(ch1);
            sort(ch2);
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    System.out.println("strings are not anagrams");
                    return;
                }
                System.out.println("strings are anagrams");
                break;

            }
        }
    }
}


