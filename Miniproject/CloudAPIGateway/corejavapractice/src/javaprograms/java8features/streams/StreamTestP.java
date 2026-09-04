package javaprograms.java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestP {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(15);
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(25);
        list.add(20);
        System.out.println(list);
        List<Integer> list1 = list.stream().map(i -> i + 10).collect(Collectors.toList());
        System.out.println(list1);
        long count = list.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);
        List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);
        Comparator<Integer> comparator = (i1, i2) -> -i1.compareTo(i2);
        List<Integer> list3 = list.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(list3);
        Integer min = list.stream().min(comparator).get();
        System.out.println(min);
        Integer max = list.stream().max(comparator).get();
        System.out.println(max);
        list.stream().forEach(i -> System.out.println(i));
        list.stream().forEach(System.out::println);
        Integer[] integers = list.stream().toArray(Integer[]::new);
        for (Integer i : integers) {
            System.out.println(i);
        }
        Stream s = Stream.of(99, 9999, 999, 999999);
        s.forEach(System.out::println);
        Double[] d = {10.0, 10.1, 10.2, 10.3};
        Stream s1 = Stream.of(d);
        s1.forEach(System.out::println);
    }
}
