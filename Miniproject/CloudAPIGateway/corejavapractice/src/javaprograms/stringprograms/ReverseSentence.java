package javaprograms.stringprograms;

public class ReverseSentence
{
    public static void main(String[] args) {
        String str="Java is best programming language";
        reverseSentence(str);
        reverseSentenceSb(str);
    }
    private static void reverseSentence(String str)
    {
        String[] strArray=str.split(" ");
        int n=strArray.length;
        String strRev="";
        for (int i=n-1;i>=0;i--)
        {
            strRev+=strArray[i];
            if(i!=0)
            {
                strRev+=" ";
            }
        }
        System.out.println(strRev);
    }
    private static void reverseSentenceSb(String str)
    {
            String[] strArray=str.split(" ");
            int n=strArray.length;
            StringBuilder strRev=new StringBuilder();
            for (int i=n-1;i>=0;i--)
            {
               strRev.append(strArray[i]);
                if(i!=0)
                {
                    strRev.append(" ");
                }
            }
            System.out.println(strRev);
    }


}
