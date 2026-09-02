package javaprograms.arrays;

import java.util.Arrays;

public class MergingOfTwoSortedArraysP {
    public static void main(String[] args) {
        int[] arr1 = new int[]{-7, 12, 17, 29, 41, 56, 79};
        int[] arr2 = new int[]{-9, -3, 0, 5, 19};
        mergingOfTwoSortedArrays(arr1, arr2);
    }

    private static void mergingOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                k++;
                i++;
            } else {
                mergedArray[k] = arr2[j];
                k++;
                j++;
            }

        }
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
        System.out.println(Arrays.toString(mergedArray));
    }
}
