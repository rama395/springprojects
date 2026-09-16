package javaprograms.stringprograms;

public class RemoveCharFromStringP
{
    public static void main(String[] args) {
        String str="Helloo World";
        char c='o';
        removeChar(str,c);

    }

    private static void removeChar(String str,char target)
    {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char currentChar=str.charAt(i);
            if (currentChar!=target)
            {
                stringBuilder.append(currentChar);
            }
        }
        System.out.println(stringBuilder);
    }
}