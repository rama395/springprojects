package javaprograms.stringprograms;

import java.util.HashMap;
import java.util.HashSet;

public class NonRepeatedCharInString
{
    public static void main(String[] args) {
        String str="goodmorning";
        Character c=findFirstNonRepeatedChar(str);
        if(c!=null)
        {
            System.out.println("First non repeated char in string is :"+c);

        }
        else
        {
            System.out.println("No non repeated char in string");
        }

    }

    private static Character findFirstNonRepeatedChar(String str) {
        HashMap<Character,Integer> characterIntegerHashMap=new HashMap<>();
        for (int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(characterIntegerHashMap.containsKey(c))
            {
                characterIntegerHashMap.put(c,characterIntegerHashMap.get(c)+1);
            }
            else {
                characterIntegerHashMap.put(c,1);
            }
        }
        //since Hashmap doesnot maintain order,to get characters by order
        for (int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(characterIntegerHashMap.get(c)==1)
            {
                return c;
            }
        }
        return null;
    }
}
