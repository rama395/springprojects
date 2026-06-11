package javaprograms.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateElements
{
    public static void main(String[] args) {
        int[] arr={4,2,3,1,2,4,5};
        removeDuplicatesUsingHashSet(arr);

    }
    private static void removeDuplicatesUsingHashSet(int[] arr)
    {
        Set<Integer> set=new HashSet<>();
        for (int num:arr)
        {
            set.add(num);
        }
        System.out.println(set);
    }

}
