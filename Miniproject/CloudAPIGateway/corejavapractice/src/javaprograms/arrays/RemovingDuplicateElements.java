package javaprograms.arrays;

import java.util.*;

public class RemovingDuplicateElements
{
    public static void main(String[] args) {
        int[] arr={4,2,3,1,2,4,5};
        int[] arr2=removeDuplicatesUsingHashSet(arr);
        System.out.println(Arrays.toString(arr2));
        int[] arr3=removeDuplicatesWithoutUsingHashSet(arr);
        System.out.println(Arrays.toString(arr3));
    }
    private static int[] removeDuplicatesUsingHashSet(int[] arr)
    {
        Set<Integer> set=new HashSet<>();
        for (int num:arr)
        {
            set.add(num);
        }
       // System.out.println(set);
        int[] arr1=new int[set.size()];
        int i=0;
        for (int ele:set)
        {
            arr1[i]=ele;
            i++;
        }
        return arr1;
    }
    private static int[] removeDuplicatesWithoutUsingHashSet(int[] arr)
    {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i< arr.length;i++)
        {
            boolean isDuplicate=false;
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    isDuplicate=true;
                }

            }
            if (!isDuplicate)
            {
                list.add(arr[i]);
            }
        }
        int[] arr2=new int[list.size()];
        int i=0;
        for (int a:list)
        {
            arr2[i]=a;
            i++;
        }
        return arr2;
    }
}
