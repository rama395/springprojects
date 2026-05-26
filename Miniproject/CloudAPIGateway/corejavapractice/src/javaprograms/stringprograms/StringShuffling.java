package javaprograms.stringprograms;

public class StringShuffling
{
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        String s3="dbaecf";
        stringIsValidShuffle(s1,s2,s3);

    }
    private static void stringIsValidShuffle(String s1,String s2,String s3)
    {
        int first=0;
        int second=0;
        for (int i=0;i<s3.length();i++)
        {
            char ch=s3.charAt(i);
            if (first<s1.length() && s1.charAt(first)==ch)
            {
                first++;
            } else if (second<s2.length() && s2.charAt(second)==ch) {
                second++;
            }
            else {
                System.out.println("it is not valid shuffle string");
                return;
            }
        }
        System.out.println("it is valid shuffle string");
    }

}
