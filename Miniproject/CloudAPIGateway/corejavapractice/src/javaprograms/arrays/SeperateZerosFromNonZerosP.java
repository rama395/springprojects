package javaprograms.arrays;

import java.util.Arrays;

public class SeperateZerosFromNonZerosP {
    public static void main(String[] args) {
        int[] arr = {5, 1, 0, 3,6,0,12};
        int[] result = seperateZeros(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] seperateZeros(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[right] != 0) {
                right--;
            } else if (arr[left] == 0) {
                left++;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
}


