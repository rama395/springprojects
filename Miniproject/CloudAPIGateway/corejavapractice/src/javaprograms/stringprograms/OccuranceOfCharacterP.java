package javaprograms.stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OccuranceOfCharacterP {
    public static void main(String[] args) {
        String str = "SpringBoot";
        printCountOfCharacters(str);
        highestCountChar(str);

    }

    private static void printCountOfCharacters(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println(characterIntegerMap);
    }

    private static void highestCountChar(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (characterIntegerMap.containsKey(ch)) {
                int count = characterIntegerMap.get(ch);
                characterIntegerMap.put(ch, count + 1);
            } else {
                characterIntegerMap.put(ch, 1);
            }
        }
        int maxCount = 0;
        char ch = str.charAt(0);
        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                ch = entry.getKey();

            }
        }
        System.out.println(ch+" count is "+maxCount);
    }
}
