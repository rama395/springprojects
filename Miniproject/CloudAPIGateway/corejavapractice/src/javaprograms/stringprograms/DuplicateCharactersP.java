package javaprograms.stringprograms;

import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersP
{
    public static void main(String[] args) {
        String str="adidas";
        printDuplicateCharacters(str);
        printDuplicateCharactersUsingHashSet(str);
    }

    private static void printDuplicateCharacters(String str)
    {
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length-1;j++)
            {
                if (ch[i]==ch[j])
                {
                    System.out.println(ch[i]);
                }
            }
        }
    }

    private static void printDuplicateCharactersUsingHashSet(String str)
    {
        char[] ch=str.toCharArray();
        Set<Character> stringSet=new HashSet<>();
        for (char c:ch)
        {
            if (stringSet.contains(c))
            {
                System.out.println(c);
            }
            else{
                stringSet.add(c);
            }
        }
    }
}
