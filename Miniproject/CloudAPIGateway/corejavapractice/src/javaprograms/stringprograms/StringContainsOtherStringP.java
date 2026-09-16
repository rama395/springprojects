package javaprograms.stringprograms;

public class StringContainsOtherStringP
{
    public static void main(String[] args) {
        String str="java is best programming language";
        String target="no";
        stringContainsOtherString(str,target);
        stringContainsAnotherString(str,target);

    }

    private static void stringContainsOtherString(String str,String target)
    {
        int index=str.indexOf(target);
        if (index!=-1)
        {
            System.out.println("Found "+target+" in a given String");
        }
        else{
            System.out.println("Not found");
        }

    }

    private static void stringContainsAnotherString(String str,String target)
    {
        boolean result=str.contains(target);
        System.out.println("Is "+target+" present in given String? "+result);

    }

}
