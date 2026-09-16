package javaprograms.stringprograms;

public class ReplaceSpaceWithCharacterP
{
    public static void main(String[] args) {
        String str="Java is great";
        String replacement="%20";
        replaceSpacesUsingReplace(str);
        replaceSpaces(str);

    }
    private static void replaceSpacesUsingReplace(String str)
    {
        String replacedString=str.replace(" ","%20");
        System.out.println(replacedString);
    }

    private static void replaceSpaces(String str)
    {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch==' ')
            {
                stringBuilder.append("%20");
            }
            else{
                stringBuilder.append(ch);
            }
        }
        System.out.println(stringBuilder);
    }

}
