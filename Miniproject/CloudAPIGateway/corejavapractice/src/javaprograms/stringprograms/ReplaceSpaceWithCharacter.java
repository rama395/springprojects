package javaprograms.stringprograms;

public class ReplaceSpaceWithCharacter
{
    public static void main(String[] args) {
        String str="Java is great";
        String replacement="%20";
        replaceSpacesUsingReplace(str);
        replaceSpaces(str);

    }
    private static void replaceSpacesUsingReplace(String str)
    {
        String res=str.replace(" ","%20");
        System.out.println(res);
    }

    private static void replaceSpaces(String str)
    {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch==' ')
            {
                sb.append("%20");
            }
            else
            {
                sb.append(ch);
            }

        }
        System.out.println(sb);
    }

}
