package javaprograms.arrays;

import java.util.*;

public class RemovingDuplicateElementsP
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
        Set<Integer> integerSet=new HashSet<>();
        for (int i:arr)
        {
            integerSet.add(i);
        }
        int[] arr1=new int[integerSet.size()];
        int i=0;
        for (int ele:integerSet)
        {
            arr1[i]=ele;
            i++;
        }
        return arr1;

    }
    private static int[] removeDuplicatesWithoutUsingHashSet(int[] arr) {
        List<Integer> integerList=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            boolean isDuplicate=false;
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    isDuplicate=true;
                }
            }
            if (!isDuplicate)
            {
                integerList.add(arr[i]);
            }
        }
        int[] arr2=new int[integerList.size()];
        int i=0;
        for (int b:integerList)
        {
            arr2[i]=b;
            i++;
        }
        return arr2;
    }
}
