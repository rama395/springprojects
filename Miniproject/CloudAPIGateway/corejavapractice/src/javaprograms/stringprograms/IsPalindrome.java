package javaprograms.stringprograms;

public class IsPalindrome
{
    public static void main(String[] args) {
        String str="madam";
        palindrome(str);
        palindromeEfficientApproach(str);
    }

    private static void palindrome(String str)
    {
        StringBuilder stringBuilder=new StringBuilder(str);
        String strRev=stringBuilder.reverse().toString();
        if(str.equalsIgnoreCase(strRev))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }
    }

    private static void palindromeEfficientApproach(String str)
    {
        int first=0;
        int last=str.length()-1;
        while(first<=last)
        {
            if (str.charAt(first)!=str.charAt(last))
            {
                System.out.println("not a palindrome");
                return;
            }
            first++;
            last--;
        }
        System.out.println("palindrome");
    }
}
