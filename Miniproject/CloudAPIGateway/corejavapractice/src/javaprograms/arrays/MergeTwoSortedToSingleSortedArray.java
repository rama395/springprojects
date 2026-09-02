package javaprograms.arrays;

import java.util.*;

public class MergeTwoSortedToSingleSortedArray
{
    public static void main(String[] args) {
        int[] arr1 = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
        int[] arr2 = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
        int[] mergedArray=removeDuplicates(arr1,arr2);
        System.out.println(Arrays.toString(mergedArray));
    }

    private static int[] removeDuplicates(int[] arr1,int[] arr2)
    {
        int[] mergedArray=new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length)
        {
            mergedArray[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length)
        {
            mergedArray[k]=arr2[j];
            k++;
            j++;
        }
        //removing duplicates by using set and adding merged array elements into set
        Set<Integer> setWithNoDuplicates=new TreeSet<>();
        for (int l=0;l<mergedArray.length;l++)
        {
            setWithNoDuplicates.add(mergedArray[l]);
        }
        //now set has only unique elements.now iterate all elements & add them to mergedarray
        Iterator<Integer> it=setWithNoDuplicates.iterator();
        int[] mergedArrayWithNoDuplicates=new int[setWithNoDuplicates.size()];
        int m=0;
        //adding all elements of setWithNoDuplicates into mergedArrayWithNoDuplicates
        while(it.hasNext())
        {
            mergedArrayWithNoDuplicates[m]=it.next();
            m++;
        }
        //Sort mergedarray without duplicates
        Arrays.sort(mergedArrayWithNoDuplicates);
        return mergedArrayWithNoDuplicates;
    }
}
