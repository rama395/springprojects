package javaprograms.arrays;

import java.util.Arrays;

//min absolute diff means minimum value we get when we do diff between 2 elements present beside each other.
public class MinimumAbsoluteDifference
{
    public static void main(String[] args) {
        int[] inputArray={5, 8, 4, 2, 9, 0};
        minimumAbsoluteDifference(inputArray);
    }
    private static void minimumAbsoluteDifference(int[] inputArray)
    {
        Arrays.sort(inputArray);
        //sorted Array {0,2,4,5,8,9}
        int minimum=Math.abs(inputArray[1]-inputArray[0]);
        int firstElement=inputArray[0];
        int secondElement=inputArray[1];
        for (int i=2;i<inputArray.length;i++)
        {
            if (Math.abs(inputArray[i]-inputArray[i-1])<minimum)
            {
                minimum=Math.abs(inputArray[i]-inputArray[i-1]);
                firstElement=inputArray[i-1];
                secondElement=inputArray[i];
            }
        }
        System.out.println("Sorted Array:"+Arrays.toString(inputArray));
        System.out.println("Minimum Absolute Difference: "+minimum);
        System.out.println("Pair of ELements: ("+firstElement+" , "+secondElement+ ")");
    }
}
