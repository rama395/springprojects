package javaprograms.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//to get common elements present in all arrays
public class IntersectionOfArraysP
{
    public static void main(String[] args) {
        Integer[] inputArray1 = {2, 3, 4, 7, 1};
        Integer[] inputArray2 = {4, 1, 3, 5};
        Integer[] inputArray3 = {8, 4, 6, 2, 1};
        Integer[] inputArray4 = {7, 9, 4, 1};
        intersectionOfArrays(inputArray1,inputArray2,inputArray3,inputArray4);
    }
    private static void intersectionOfArrays(Integer[]... inputArrays)
    {
        System.out.println("Input Arrays: ");
        for (Integer[] input:inputArrays)
        {
            System.out.println(Arrays.toString(input));
        }
        Set<Integer> integerSet=new HashSet<>(Arrays.asList(inputArrays[0]));
        for (int i=1;i< inputArrays.length;i++)
        {
            Set<Integer> integerSet1=new HashSet<>(Arrays.asList(inputArrays[i]));
            integerSet.retainAll(integerSet1);
        }
        System.out.println("Intersection of all Arrays");
        System.out.println(integerSet);

    }
}
