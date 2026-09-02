package javaprograms.arrays;

//find duplicate number in array

import java.util.*;

public class FindDuplicateNumberP
{
    public static void main(String[] args) {
        int[] array={1,3,2,4,5,4,5};
        //findDuplicate(array);
        findDuplicateUsingHashSet(array);
        findDuplicatesUsingHashMap(array);
        findDuplicatesUsingSort(array);

    }
    //only when array is having all numbers(if we take from 1 to 5 all 1,2,3,4,5 should be present)from 1 to n and only 1 duplicate is there
    private static void findDuplicate(int[] arr)
    {
        int n=arr.length-1;
        int totalSum=n*(n+1)/2;
        int arrSum=0;
        for (int a:arr)
        {
            arrSum+=a;
        }
        System.out.println("Duplicate number in given array is:"+(arrSum-totalSum));
    }
    //using hashset
    private static void findDuplicateUsingHashSet(int[] arr)
    {
        Set<Integer> integerSet=new HashSet<>();
        for (int a:arr)
        {
            if (integerSet.contains(a))
            {
                System.out.println("Duplicate number:"+a);
            }
            else {
                integerSet.add(a);
            }
        }
    }
    //using hashmap
    private static void findDuplicatesUsingHashMap(int[] arr)
    {
        Map<Integer,Integer> hashMap=new HashMap<>();
        for (int ele:arr)
        {
            if (hashMap.get(ele)==null)
            {
                hashMap.put(ele,1);
            }
            else {
                hashMap.put(ele,hashMap.get(ele)+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: hashMap.entrySet())
        {
            if (entry.getValue()>1)
            {
                System.out.println("Duplicate number: "+entry.getKey()+" is found");
            }
        }
    }
    //using sort()

    private static void findDuplicatesUsingSort(int[] arr)
    {
        Arrays.sort(arr);
        int prev=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]==prev)
            {
                System.out.println("Duplicate element: "+arr[i]);
            }
            prev=arr[i];
        }
        //System.out.println(Arrays.toString(arr));

    }

}
