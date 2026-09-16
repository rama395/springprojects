package javaprograms.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharInStringP {
    public static void main(String[] args) {
        String str = "goodmorning";
        Character c = findFirstNonRepeatedChar(str);
        if (c != null) {
            System.out.println(" First non-repeated character in String: " + c);
        } else {
            System.out.println("No Non-repeated character in String");
        }

    }

    private static Character findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            } else {
                characterIntegerMap.put(ch, 1);
            }
        }
        //Hashmap does not maintain order,to get characters in order
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (characterIntegerMap.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }
}
