package javaprograms.stringprograms;


import java.util.Arrays;

// Check if two strings are anagrams
// Two strings are anagrams if they contain the same characters in a different order
public class CheckStringAnagramP {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        isAnagramEquals(s1, s2);
        isAnagram(s1, s2);

    }

    //using equals()
    private static void isAnagramEquals(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        if (s1.length() != s2.length()) {
            System.out.println("Given strings are not anagrams");
        } else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("not anagrams");
            }
        }
    }

    private static void isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        if (s1.length() != s2.length()) {
            System.out.println("Given strings are not anagrams");
        }
        else{
                char[] c1 = s1.toCharArray();
                char[] c2 = s2.toCharArray();
                Arrays.sort(c1);
                Arrays.sort(c2);
                for (int i = 0; i < c1.length; i++) {
                    if (c1[i] == c2[i]) {
                        System.out.println("Anagrams");
                        break;
                    }
                    else {
                        System.out.println("not anagrams");
                        break;
                    }
                }

        }
    }
}



