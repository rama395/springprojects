package javaprograms.stringprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters
{
    public static void main(String[] args) {
        String str="adidas";
        printDuplicateCharacters(str);
        printDuplicateCharactersUsingHashSet(str);
    }

    private static void printDuplicateCharacters(String str)
    {
        char[] ch=str.toCharArray();
        System.out.println("Duplicate characters in the string: ");
        for(int i=0;i< ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println(ch[i]);
                }
            }
        }

    }

    private static void printDuplicateCharactersUsingHashSet(String str)
    {
        char[] ch=str.toCharArray();
        System.out.println("Duplicate characters in the string: ");
        Set<Character> characters=new HashSet<>();
        for (char c:ch)
        {
            if (characters.contains(c))
            {
                System.out.println(c);
            }
            else {
                characters.add(c);
            }

        }

    }
}
