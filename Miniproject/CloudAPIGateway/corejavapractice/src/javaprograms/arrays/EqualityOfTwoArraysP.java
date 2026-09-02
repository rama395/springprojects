package javaprograms.arrays;

import java.util.Arrays;

//find equality of 2 arrays..arrays lengths should be same & order also should be same(this is strict equality)
public class EqualityOfTwoArraysP {
    public static void main(String[] args) {
        int[] arr1 = {10, 30, 50, 20};
        int[] arr2 = {10, 30, 50, 20};
        findEquality(arr1, arr2);
        findEqualityUsingEquals(arr1, arr2);

    }

    private static void findEquality(int[] arr1, int[] arr2) {
        boolean equalornot = true;
        if (arr1.length != arr2.length) {
            equalornot = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equalornot = false;
                }
            }
        }
        if (equalornot) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    //using equals()
    private static void findEqualityUsingEquals(int[] arr1, int[] arr2) {
        System.out.println(Arrays.equals(arr1, arr2));
    }

}
