package javaprograms.stringprograms;

public class DuplicateCharacters
{
    public static void main(String[] args) {
        String str="springboot";
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
}
