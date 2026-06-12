package javaprograms.collections.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapRetrieval
{
    public static void main(String[] args) {
        Map<String,Integer> fruits=new TreeMap<>();
        fruits.put("Blueberry",3);
        fruits.put("Dragon fruit",2);
        for (Map.Entry<String,Integer> entry:fruits.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
