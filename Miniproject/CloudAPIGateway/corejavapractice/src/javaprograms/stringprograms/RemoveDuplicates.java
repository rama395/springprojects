package javaprograms.stringprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        String str="Programming";
        removeDuplicatesLinkedHashSet(str);
        removeDuplicates(str);
    }
    private static void removeDuplicatesLinkedHashSet(String str)
    {
        LinkedHashSet<Character> linkedHashSet=new LinkedHashSet<>();
        for (char c:str.toCharArray())
        {
           linkedHashSet.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for (char c:linkedHashSet)
        {
            sb.append(c);
        }
        System.out.println(sb);
    }
    private static void removeDuplicates(String str)
    {
        StringBuilder sb=new StringBuilder();
        for (char c:str.toCharArray())
        {
            if (sb.indexOf(String.valueOf(c))==-1)
            {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
