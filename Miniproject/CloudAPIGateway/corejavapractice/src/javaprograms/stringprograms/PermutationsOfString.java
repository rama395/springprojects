package javaprograms.stringprograms;

public class PermutationsOfString {
    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str, "");
    }
    private static void printPermutations(String str,String result)
    {
        if(str.length()==0)
        {
            System.out.println(result);
            return;
        }
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String remChars=str.substring(0,i)+str.substring(i+1);
            printPermutations(remChars,result+ch);
        }

    }

}
