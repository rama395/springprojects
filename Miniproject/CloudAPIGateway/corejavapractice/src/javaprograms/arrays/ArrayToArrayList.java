package javaprograms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] arr = new String[]{"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP"};
        arrayToArrayListUsingAsList(arr);
        addAll(arr);
        arraysAddAll(arr);
        streams(arr);
        arrayListToArray();
    }

    private static void arrayToArrayListUsingAsList(String[] arr) {
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);
    }

    private static void addAll(String[] arr) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
        System.out.println(list);
    }

    private static void arraysAddAll(String[] arr) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println(list);
    }

    private static void streams(String[] arr) {
        List<Object> list = Arrays.stream(arr).collect(Collectors.toList());
        System.out.println(list);
    }

    private static void arrayListToArray() {
        List<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("ANDROID");
        list.add("JSP");
        list.add("STRUTS");
        list.add("HADOOP");
        String[] array = new String[list.size()];
        list.toArray(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}