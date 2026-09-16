package javaprograms.stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesP
{
    public static void main(String[] args) {
        String str="Programming";
        removeDuplicatesLinkedHashSet(str);
        removeDuplicates(str);
    }
    private static void removeDuplicatesLinkedHashSet(String str)
    {
        Set<Character> characterSet=new LinkedHashSet<>();
        for (char ch:str.toCharArray())
        {
            characterSet.add(ch);
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (char ch:characterSet)
        {
           stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);

    }
    private static void removeDuplicates(String str)
    {
       StringBuilder stringBuilder=new StringBuilder();
       for (char ch:str.toCharArray())
       {
           if (stringBuilder.indexOf(String.valueOf(ch))==-1)
           {
               stringBuilder.append(ch);
           }
       }
        System.out.println(stringBuilder);
    }
}
