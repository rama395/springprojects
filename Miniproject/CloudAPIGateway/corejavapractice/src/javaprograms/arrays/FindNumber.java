package javaprograms.arrays;

import java.util.Arrays;

public class FindNumber
{
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8};
        int n=4;
        findNumber(arr,n);
        System.out.println(binarySearch(arr,n));
    }
    private static void findNumber(int[] arr,int n)
    {
        for (int a:arr)
        {
            if (a==n)
            {
                System.out.println("found:"+n);
              return;
            }
        }
        System.out.println("not found");

    }
    private static int binarySearch(int[] arr,int n)
    {
        Arrays.sort(arr);
        int start=0,end= arr.length-1;
        int index=-1;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if (n==arr[mid])
            {
                return mid;
            } else if (n<arr[mid]) {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return index;
    }

}
