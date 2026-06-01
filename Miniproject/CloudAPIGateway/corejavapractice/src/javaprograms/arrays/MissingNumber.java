package javaprograms.arrays;

public class MissingNumber
{
    public static void main(String[] args) {
        int[] array={1,2,3,5,7,6,8,10,9};
        missingNumber(array);
    }
    private static void missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int totalSum=n*(n+1)/2;
        int arrSum=0;
        for (int a:arr)
        {
            arrSum+=a;
        }
        System.out.println("missing number is:"+(totalSum-arrSum));
    }
}
