package javaprograms.langpackage.comparatorusingstring;

import java.util.TreeSet;

public class StringObjsIntoTreeSet
{
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator() );
        t.add("A");
        t.add("Z");
        t.add("K");
        t.add("B");
        t.add("a");
        System.out.println(t);

    }
}
