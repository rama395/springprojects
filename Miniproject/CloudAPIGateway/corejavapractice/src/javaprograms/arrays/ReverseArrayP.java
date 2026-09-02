package javaprograms.arrays;

import java.util.Arrays;

public class ReverseArrayP {
    public static void main(String[] args) {
        int[] array = {7, 12, 25, 55, 75};
        reverseArray(array);

    }

    private static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reverse of an array: " + Arrays.toString(arr));
    }
}
