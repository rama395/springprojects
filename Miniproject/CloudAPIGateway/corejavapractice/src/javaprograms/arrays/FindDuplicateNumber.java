package javaprograms.arrays;

import java.util.*;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3};
        duplicateNumber(arr);
        duplicateNumberUsingHashSet(arr);
        duplicateNumberUsingSort(arr);
        duplicateNumberUsingHashMap(arr);

    }

    private static void duplicateNumber(int[] arr) {
        int n = arr.length - 1;
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int a : arr) {
            arrSum += a;
        }
        System.out.println("Duplicate number:" + (arrSum - totalSum));
    }

    private static void duplicateNumberUsingHashSet(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();
        for (int a : arr) {
            if (hashSet.contains(a)) {
                System.out.println("duplicate number:" + a);
            } else {
                hashSet.add(a);
            }
        }
    }

    private static void duplicateNumberUsingSort(int[] arr) {
        Arrays.sort(arr);
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prev) {
                System.out.println("duplicate element:" + arr[i]);
            }
            prev = arr[i];
        }
        System.out.println("Array" + Arrays.toString(arr));
    }

    private static void duplicateNumberUsingHashMap(int[] arr) {
        Map<Integer, Integer> integerHashMap = new HashMap<>();
        for (int element : arr) {
            if (integerHashMap.get(element) == null) {
                integerHashMap.put(element, 1);
            } else {
                integerHashMap.put(element, integerHashMap.get(element) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : integerHashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element " + entry.getKey() + " is found");
            }
        }

    }
}
