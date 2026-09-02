package javaprograms.arrays;

import java.util.Arrays;

public class FindNumberP {

    public static void main(String[] args) {
        int[] arr = {10, 30, 70, 50, 40};
        int n = 20;
        findNumber(arr, n);
        System.out.println("---------------");
        System.out.println(findNumberUsingBinarySearch(arr, n));
    }


    //find number using foreach loop
    private static void findNumber(int[] arr, int n) {
        for (int a : arr) {
            if (n == a) {
                System.out.println("Number " + n + " found");
                return;
            }
        }
        System.out.println("Number " + n + " not found");
    }


    //find number using binary search
    private static int findNumberUsingBinarySearch(int[] arr, int n) {
        Arrays.sort(arr);//{10,30,40,50,70}
        int start = 0, end = arr.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (n == arr[mid]) {
                return mid;
            } else if (n < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}