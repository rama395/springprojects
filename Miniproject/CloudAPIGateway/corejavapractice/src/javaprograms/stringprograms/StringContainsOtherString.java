package javaprograms.stringprograms;

public class StringContainsOtherString
{
    public static void main(String[] args) {
        String str="java is best programming language";
        String target="best";
        stringContainsOtherString(str,target);
        stringContainsAnotherString(str,target);

    }

    private static void stringContainsOtherString(String str,String target)
    {
        int index=str.indexOf(target);
        if(index!=-1)
        {
            System.out.println("found "+target+ " at index "+index);
        }
        else {
            System.out.println("target not found");
        }
    }

    private static void stringContainsAnotherString(String str,String target)
    {
        boolean result=str.contains(target);
        System.out.println("Is "+target+" present in string: "+result);
    }

}
