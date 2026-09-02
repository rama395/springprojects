package javaprograms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostFrequentElementP
{
    public static void main(String[] args) {
        int[] arr={4,2,3,1,2,5};
        findMostFrequentElement(arr);
    }
    private static void findMostFrequentElement(int[] arr)
    {
        Map<Integer,Integer> integerMap=new HashMap<>();
        for (int a:arr)
        {
            if (integerMap.containsKey(a))
            {
                integerMap.put(a,integerMap.get(a)+1);
            }
            else {
                integerMap.put(a,1);
            }
        }
        int element=0;
        int freq=1;
        Set<Map.Entry<Integer,Integer>>  entrySet=integerMap.entrySet();
        for (Map.Entry<Integer,Integer> entry:entrySet)
        {
            if (entry.getValue()>freq)
            {
                element=entry.getKey();
                freq=entry.getValue();
            }
        }
        if(freq>1)
        {
            System.out.println(Arrays.toString(arr));
            System.out.println("Most Frequent element: "+element);
            System.out.println("Its Frequency:"+freq);
        }
    }
}
