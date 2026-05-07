package javaprograms;

public class AsciiValues
{
    public static void main(String[] args)
    {
        for(int i=0;i<=255;i++)
        {
            char ch=(char)i;
            System.out.print(i+"-"+ch+"  ");
        }
    }
}
