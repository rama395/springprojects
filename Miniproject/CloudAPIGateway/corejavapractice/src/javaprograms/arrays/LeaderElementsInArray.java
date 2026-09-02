package javaprograms.arrays;

//leader means if an element is greater than its rightmost elements & last rightmost element is always leader bcoz there r no elements to its right
public class LeaderElementsInArray
{
    public static void main(String[] args) {
        int[] arr={12,3,9,11,10,8};
        leaderElementsInArray(arr);
    }
    private static void leaderElementsInArray(int[] arr)
    {
        int rightMostEle=arr.length-1;
        System.out.println(arr[rightMostEle]);
        for (int i=arr.length-2;i>=0;i--)
        {
            if (arr[i]>arr[i+1])
            {


            }

        }
    }
}
