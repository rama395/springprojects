package javaprograms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElements
{
    public static void main(String[] args) {
        int[] arr={12, 9, 12, 9, 10, 9, 10, 11};
        occuranceOfElements(arr);

    }
    private static void occuranceOfElements(int[] arr)
    {
        Map<Integer,Integer> countOfElements=new HashMap<>();
        for (int i:arr)
        {
            if (countOfElements.containsKey(i))
            {
                countOfElements.put(i,countOfElements.get(i)+1);
            }
            else {
                countOfElements.put(i,1);
            }
        }
        System.out.println("Input Array: "+ Arrays.toString(arr));
        System.out.println("Element count: "+countOfElements);

    }
}
