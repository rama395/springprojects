package javaprograms.java8features.mapflatmap;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample
{
    public static void main(String[] args) {
        List<List<String>> list= Arrays.asList(Arrays.asList("A","B"),
        Arrays.asList("C","D"),
        Arrays.asList("E","F"));
        List<String> result=list.stream().flatMap(List::stream).toList();
        System.out.println(result);
    }
}
