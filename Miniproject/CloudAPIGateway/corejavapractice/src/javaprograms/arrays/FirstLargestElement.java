package javaprograms.arrays;

public class FirstLargestElement {
    public static void main(String[] args) {
        int arr[] = {16, 19, 25, 3, 5, 8, 10, 21};
        firstLargestElement(arr);
        secondLargestElement(arr);

    }

    private static void firstLargestElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int max = arr[0];
        for (int i = 1; i <= end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
    private static void secondLargestElement(int[] arr)
    {
        int largest=arr[0];
        int secLargest=arr[0];
        for (int i=1;i< arr.length;i++)
        {
            if (arr[i]>largest)
            {
                secLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secLargest && arr[i] !=largest) {
                secLargest=arr[i];
            }
        }
        System.out.println(secLargest);
    }

}
