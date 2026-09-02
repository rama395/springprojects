package javaprograms.arrays;

public class LargestElementsP
{
    public static void main(String[] args) {
        int arr[] = {16, 19, 25, 3, 5, 8, 10, 21};
        firstLargestElement(arr);
        secondLargestElement(arr);
    }
    //first largest element
    private static void firstLargestElement(int[] arr)
    {
        int start=0,end=arr.length-1;
        int max=arr[start];
        for (int i=1;i<=end;i++)
        {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    //to find 2nd largest element
    private static void secondLargestElement(int[] arr)
    {
        int largest=arr[0],secondLargest=arr[0];
        for (int i=1;i<=arr.length-1;i++)
        {
            if (arr[i]>largest)
            {
                secondLargest=largest;//16
                largest=arr[i];//25
            }
            else if (arr[i]>secondLargest && arr[i]!=largest)
            {
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
