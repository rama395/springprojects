package javaprograms.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetRetrieval
{
    public static void main(String[] args) {
        Set<String> courses=new HashSet<>();
        courses.add("Core Java");
        courses.add("Spring");
        courses.add("Microservices");
        for (String a:courses)
        {
            System.out.println(a);
        }
    }
}
