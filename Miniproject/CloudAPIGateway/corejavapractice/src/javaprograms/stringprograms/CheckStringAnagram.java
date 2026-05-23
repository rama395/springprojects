package javaprograms.stringprograms;


import java.util.Arrays;

// Check if two strings are anagrams
// Two strings are anagrams if they contain the same characters in a different order
public class CheckStringAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        if (s1.length() != s2.length()) {
            System.out.println("strings are not anagrams");
        } else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1,ch2))
            {
                System.out.println("these strings are anagrams");
            }
            else {
                System.out.println("strings are not anagrams");
            }

//            for (int i = 0; i < ch1.length; i++) {
//                if (ch1[i] != ch2[i]) {
//                    System.out.println("strings are not anagrams");
//                    return;
//                }
//
//            }
//            System.out.println("these strings are anagrams");


        }
    }
}


