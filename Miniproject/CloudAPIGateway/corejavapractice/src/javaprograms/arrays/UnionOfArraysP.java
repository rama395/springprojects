package javaprograms.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArraysP {
    public static void main(String[] args) {
        int[] inputArray1 = {2, 3, 4, 7, 1};
        int[] inputArray2 = {4, 1, 3, 5};
        int[] inputArray3 = {8, 4, 6, 2, 1};
        int[] inputArray4 = {7, 9, 4, 1};
        unionOfArrays(inputArray1, inputArray2, inputArray3, inputArray4);
    }

    private static void unionOfArrays(int[]... inputArrays) {
        Set<Integer> unionSet = new HashSet<>();
        System.out.println("Input Arrays");
        for (int[] inputArray : inputArrays) {
            System.out.println(Arrays.toString(inputArray));
            for (int i : inputArray) {
                unionSet.add(i);
            }
        }
        System.out.println("union of all arrays: " + unionSet);
    }
}
