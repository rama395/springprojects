package javaprograms.stringprograms;

public class ReverseSentenceP
{
    public static void main(String[] args) {
        String str="Java is best programming language";
        reverseSentence(str);
        reverseSentenceSb(str);
    }
    private static void reverseSentence(String str)
    {
        String[] stringArr=str.split(" ");
        int n=stringArr.length;
        String strRev="";
        for (int i=n-1;i>=0;i--)
        {
            strRev+=stringArr[i];
            if (i!=0)
            {
                strRev+=" ";
            }
        }
        System.out.println(strRev);
    }
    private static void reverseSentenceSb(String str)
    {
        String[] stringArray=str.split(" ");
        int n=stringArray.length;
        StringBuilder strRev=new StringBuilder();
        for (int i=n-1;i>=0;i--)
        {
            strRev.append(stringArray[i]);
            if (i!=0)
            {
                strRev.append(" ");
            }
        }
        System.out.println(strRev);
    }
}
