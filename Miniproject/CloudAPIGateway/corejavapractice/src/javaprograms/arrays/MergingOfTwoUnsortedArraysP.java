package javaprograms.arrays;

import java.util.Arrays;

public class MergingOfTwoUnsortedArraysP {
    public static void main(String[] args) {
        int[] arr1 = new int[]{6,4,3,1};
        int[] arr2 = new int[]{10,5,2,7,9};
        mergingOfTwoUnsortedArrays(arr1, arr2);
    }

    private static void mergingOfTwoUnsortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            k++;
            j++;
        }
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }
}
