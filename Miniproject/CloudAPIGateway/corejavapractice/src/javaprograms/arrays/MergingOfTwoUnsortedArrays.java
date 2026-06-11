package javaprograms.arrays;

import java.util.Arrays;

public class MergingOfTwoUnsortedArrays
{
    public static void main(String[] args) {
        int[] arr1 = new int[] {12, -7, 18, 9, 37, -1, 21};
        int[] arr2 = new int[] {27, 8, 71, -9, 18};
        mergingOfTwoUnsortedArrays(arr1,arr2);
    }
    private static void mergingOfTwoUnsortedArrays(int[] arr1,int[] arr2)
    {
        int[] mergedArray=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length)
        {
            mergedArray[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            mergedArray[k]=arr2[j];
            j++;
            k++;
        }
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }
}
