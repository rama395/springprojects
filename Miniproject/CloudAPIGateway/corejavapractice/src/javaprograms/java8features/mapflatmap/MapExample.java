package javaprograms.java8features.mapflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Swiss", "Paris", "Europe");
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseNames);
    }
}
