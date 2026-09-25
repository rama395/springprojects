package javaprograms.arraysprograms;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArrays
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
        System.out.println("Input Arrays");
        for (Integer[] inputArray:inputArrays)
        {
            System.out.println(Arrays.toString(inputArray));
        }
        HashSet<Integer> intersectionSet=new HashSet<>(Arrays.asList(inputArrays[0]));
        for (int i=1;i< inputArrays.length;i++)
        {
            HashSet<Integer> hashSet=new HashSet<>(Arrays.asList(inputArrays[i]));
            intersectionSet.retainAll(hashSet);
        }
        System.out.println("Intersection of Input Arrays");
        System.out.println(intersectionSet);
    }
}
