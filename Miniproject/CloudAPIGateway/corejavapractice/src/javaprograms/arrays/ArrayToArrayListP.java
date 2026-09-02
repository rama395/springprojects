package javaprograms.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToArrayListP
{
    public static void main(String[] args) {
        String[] arr = new String[]{"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP"};
        arrayToarrayListUsingAsList(arr);
        arrayToArrayListUsingaddAll(arr);
        arraysAddAll(arr);
        streams(arr);
        ArrayListToArray();

    }
    private static void arrayToarrayListUsingAsList(String[] arr)
    {
        List<String> list=new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);
    }
    private static void arrayToArrayListUsingaddAll(String[] arr)
    {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,arr);
        System.out.println(list);
    }
    private static void arraysAddAll(String[] arr)
    {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println(list);
    }
    private static void streams(String[] arr)
    {
        List<Object> list=Arrays.stream(arr).collect(Collectors.toList());
        System.out.println(list);
    }
    private static void ArrayListToArray()
    {
        List<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("ANDROID");
        list.add("JSP");
        list.add("STRUTS");
        list.add("HADOOP");
        String[] array=new String[list.size()];
        list.toArray(array);
        for (String s:array)
        {
            System.out.println(s);
        }
    }
}
