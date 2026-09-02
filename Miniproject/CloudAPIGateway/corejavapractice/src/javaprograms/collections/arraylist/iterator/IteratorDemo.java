package javaprograms.collections.arraylist.iterator;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<=10;i++)
        {
            list.add(i);
        }
        System.out.println(list);
        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext())
        {
            Integer i=(Integer) iterator.next();
            if (i%2==0)
            {
                System.out.println(i);
            }
            else {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
