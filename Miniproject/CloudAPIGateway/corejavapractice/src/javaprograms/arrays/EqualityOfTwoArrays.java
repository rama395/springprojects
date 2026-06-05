package javaprograms.arrays;

import java.util.Arrays;

public class EqualityOfTwoArrays
{
    public static void main(String[] args) {
        int[] arr1={1,2,5,7,4};
        int[] arr2={1,2,5,7,4};
        equalityOfTwoArrays(arr1,arr2);
        equalityUsingEquals(arr1,arr2);
    }
    private static void equalityOfTwoArrays(int[] arr1,int[] arr2)
    {
        boolean equalOrNot=true;
        if (arr1.length!=arr2.length)
        {
            equalOrNot=false;
        }
        else {
            for (int i=0;i<arr1.length;i++)
            {
                if (arr1[i]!=arr2[i])
                {
                    equalOrNot=false;
                }
            }
        }
        if (equalOrNot)
        {
            System.out.println("two arrays are equal");
        }
        else {
            System.out.println("two arrays are not equal");
        }
    }
    private static void equalityUsingEquals(int[] arr1,int[] arr2)
    {
        boolean isEqual= Arrays.equals(arr1,arr2);
        System.out.println("two arrays are equal? "+isEqual);

    }
}
