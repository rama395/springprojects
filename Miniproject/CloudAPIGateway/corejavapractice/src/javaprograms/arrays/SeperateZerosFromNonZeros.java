package javaprograms.arrays;

import java.util.Arrays;

public class SeperateZerosFromNonZeros
{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = seperateZeros(arr);
        System.out.println(Arrays.toString(result));

    }
    private static int[] seperateZeros(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if (arr[right]==0) {
               right--;
          } else if (arr[left]!=0) {
                left++;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
    }
}



//            if (arr[left]==0 && arr[right]!=0)
//            {
//                int temp=arr[left];
//                arr[left]=arr[right];
//                arr[right]=temp;
//            } else if (arr[left]!=0) {
//                left++;
//            } else if (arr[right]==0) {
//                right--;
//            }
