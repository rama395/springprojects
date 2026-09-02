package javaprograms.arrays;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceP {
    public static void main(String[] args) {
        int[] inputArr = {-3, 4, 6, -2, 5, 9};
        minimumAbsoluteDiff(inputArr);

    }

    private static void minimumAbsoluteDiff(int[] array) {
        Arrays.sort(array);//{-3,-2,4,5,6,9}
        int minimum = Math.abs(array[1] - array[0]);
        int firstElement = array[0];
        int secondElement = array[1];
        for (int i = 2; i < array.length; i++) {
            if (Math.abs(array[i] - array[i - 1]) < minimum) {
                minimum = array[i] - array[i - 1];
                firstElement = array[i - 1];
                secondElement = array[i];
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("min absolute diff: " + minimum);
        //System.out.println("min absolute diff pair elements:(" + firstElement + "," + secondElement + ")");
    }
}
