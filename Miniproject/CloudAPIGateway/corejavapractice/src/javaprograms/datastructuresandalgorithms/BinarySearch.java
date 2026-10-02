package javaprograms.datastructuresandalgorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 30, 70, 50, 80};
        int key = 30;
        int start=0,end=arr.length-1;
        //int position = binarySearch(arr, key);
        int position=binarySearchUsingRecursion(arr,key,start,end);
        if (position == -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("Element "+key+" found at index: "+position);
        }
    }

    private static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //using recursion
    private static int binarySearchUsingRecursion(int[] arr,int key,int start,int end)
    {
        Arrays.sort(arr);
        int mid=(start+end)/2;
       if(start>end)
       {
           return -1;
       }
       if(arr[mid]==key)
       {
           return mid;
       }
       else if (key>arr[mid]) {
         return   binarySearchUsingRecursion(arr,key,mid+1,end);
       }
       else {
          return binarySearchUsingRecursion(arr,key,start,mid-1);
       }
    }
}
