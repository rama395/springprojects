package javaprograms.java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTestP
{
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(0); l1.add(15); l1.add(10); l1.add(5); l1.add(30); l1.add(25); l1.add(20);
        List<Integer> l2=l1.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l3);
        long count=l3.stream().count();
        System.out.println(count);
        Comparator<Integer> comp=(i1,i2)->i1.compareTo(i2);
        List<Integer> l4=l1.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(l4);
        Integer min=l1.stream().min(comp).get();
        System.out.println(min);
        Integer max=l1.stream().max(comp).get();
        System.out.println(max);
        l3.stream().forEach(i-> System.out.println(i));
        l3.stream().forEach(System.out::println);

    }
}
