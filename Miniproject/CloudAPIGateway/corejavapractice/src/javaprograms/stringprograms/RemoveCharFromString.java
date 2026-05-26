package javaprograms.stringprograms;

public class RemoveCharFromString
{
    public static void main(String[] args) {
        String str="Hello World";
        char c='l';
        removeChar(str,c);

    }

    private static void removeChar(String str,char target)
    {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            char current=str.charAt(i);
            if (current!=target)
            {
                sb.append(current);
            }
        }
        System.out.println(sb);

    }
}