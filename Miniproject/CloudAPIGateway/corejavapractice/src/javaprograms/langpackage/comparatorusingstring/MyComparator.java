package javaprograms.langpackage.comparatorusingstring;

import java.util.Comparator;

public class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s1=(String) obj1;
        String s2=(String)obj2;
        int l1=s1.length();
        int l2=s2.length();
        return -s1.compareTo(s2);
    }
}
