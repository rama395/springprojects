package javaprograms.arrays;

import java.util.*;

//we have to merge two sorted arrays into single sorted array without duplicates
public class MergeTwoSortedToSingleSortedArrayP {
    public static void main(String[] args) {
        int[] arr1 = new int[]{7, -5, 3, 8, -4, 11, -19, 21};
        int[] arr2 = new int[]{6, 13, -7, 0, 11, -4, 3, -5};
        int[] mergedArray = removeDuplicates(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }

    private static int[] removeDuplicates(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        //initialize variables for 3 arrays
        int i = 0, j = 0, k = 0;
        //add arr1 elements to merged array
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
        //remove duplicates in merged array by using hashset
        Set<Integer> setWithOutDuplicates = new HashSet<>();
        //add all merged array elements into set without duplicates
        for (int l = 0; l < mergedArray.length; l++) {
            setWithOutDuplicates.add(mergedArray[l]);
        }
        //to iterate set elements
        Iterator<Integer> it = setWithOutDuplicates.iterator();
        //create an array for storing unique elements that got from iteration of set
        int[] mergedArrayWithOutDuplicates = new int[setWithOutDuplicates.size()];
        int m = 0;
        while (it.hasNext()) {
            mergedArrayWithOutDuplicates[m] = it.next();
            m++;
        }
        Arrays.sort(mergedArrayWithOutDuplicates);
        return mergedArrayWithOutDuplicates;
    }
}
