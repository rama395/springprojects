package javaprograms.langpackage.comparatorusingstringbuffer;

import java.util.TreeSet;

public class StringBufferIntoTreeSet
{
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t);

    }
}
