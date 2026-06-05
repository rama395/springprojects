package javaprograms.arrays;

public class LeaderElementsInArray
{
    public static void main(String[] args) {
        int[] arr={12,3,9,11,10,8};
        leaderElementsInArray(arr);
    }
    private static void leaderElementsInArray(int[] arr)
    {
        int max=arr.length-1;
        System.out.println(arr[arr.length-1]);
        for (int i=arr.length-2;i>=0;i--)
        {
            if (arr[i]>max)
            {
                System.out.println(arr[i]);
                max=arr[i];
            }
        }
    }
}
