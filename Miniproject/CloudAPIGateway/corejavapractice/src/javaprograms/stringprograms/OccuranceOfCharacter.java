package javaprograms.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter
{
    public static void main(String[] args) {
        String str="SpringBoot";
        printCountOfCharacters(str);
    }
    private static void printCountOfCharacters(String str)
    {
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        for (char c:str.toCharArray())
        {
            characterIntegerMap.put(c,characterIntegerMap.getOrDefault(c,0)+1);
        }
        System.out.println(characterIntegerMap);

    }
}
