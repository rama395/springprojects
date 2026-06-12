package javaprograms.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetrieval
{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Cherries");
        for (String fruit:list)
        {
            System.out.println(fruit);
        }
    }
}
