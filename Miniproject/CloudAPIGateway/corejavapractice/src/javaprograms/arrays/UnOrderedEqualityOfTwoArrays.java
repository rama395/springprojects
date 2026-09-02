package javaprograms.arrays;

import java.util.Arrays;

public class UnOrderedEqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {40, 20, 30, 10};
        int[] arr2 = {20, 30, 40, 10};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        sortingArrays(arr1, arr2);
    }

    private static void sortingArrays(int[] arr1, int[] arr2) {
        boolean isEqual = true;
        if (arr1.length != arr2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                }
            }
        }
        if (isEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
