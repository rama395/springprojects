package javaprograms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElementsP {
    public static void main(String[] args) {
        int[] arr = {12, 9, 12, 9, 10, 9, 10, 11};
        occuranceOfElements(arr);
    }

    private static void occuranceOfElements(int[] arr) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i : arr) {
            if (integerMap.containsKey(i)) {
                integerMap.put(i, integerMap.get(i) + 1);
            } else {
                integerMap.put(i, 1);
            }
        }
        System.out.println("Given Array:" + Arrays.toString(arr));
        System.out.println("Occurance of an element:" + integerMap);
    }
}
