package javaprograms.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter
{
    public static void main(String[] args) {
        String str="SpringBoot";
        printCountOfCharacters(str);
        highestCountChar(str);

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
    private static void highestCountChar(String str)
    {
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        for (char c:str.toCharArray())
        {
            if (characterIntegerMap.containsKey(c))
            {
                int count=characterIntegerMap.get(c);
                characterIntegerMap.put(c,count+1);
            }
            else {
                characterIntegerMap.put(c,1);
            }
           // characterIntegerMap.put(c,characterIntegerMap.getOrDefault(c,0)+1);
        }
        int maxCount =0;
        char ch=str.charAt(0);
        for(Map.Entry<Character,Integer> entry: characterIntegerMap.entrySet()){

            if(entry.getValue() > maxCount){
                maxCount= entry.getValue();
                ch= entry.getKey();
            }

        }

        System.out.println(ch +"  Count is:"+ maxCount);
    }
}
