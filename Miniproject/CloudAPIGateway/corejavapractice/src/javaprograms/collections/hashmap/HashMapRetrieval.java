package javaprograms.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapRetrieval
{
    public static void main(String[] args) {
        Map<String,Integer> fruits=new HashMap<>();
        fruits.put("BlueBerry",2);
        fruits.put("Dragon Fruit",3);
        for (Map.Entry<String,Integer> entry:fruits.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
