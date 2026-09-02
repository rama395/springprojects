package javaprograms.arrays;

import java.util.Arrays;

//leader means if an element is greater than its rightmost elements & last rightmost element is always leader bcoz there r no elements to its right.
public class LeaderElementsP
{
    public static void main(String[] args) {
        int[] arr={12,3,9,11,10,8};
        leaderElementsInArray(arr);
    }
    private static void leaderElementsInArray(int[] arr)
    {
        int max=arr[arr.length-1];
        System.out.println("Leaders in "+ Arrays.toString(arr)+" are: ");
        System.out.println(max);
        for (int i=arr.length-2;i>=0;i--)
        {
            if (arr[i]>max)
            {
                System.out.println(arr[i]);
            }
            max=arr[i];
        }

    }

}
