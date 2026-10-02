package javaprograms;

//0,1,1,2,3,5,8,13,21
public class FibonacciSeries
{
    public static void main(String[] args) {
       int n=10;
       int first=0;
       int second=1;
       for (int i=0;i<=n;i++)
       {
           System.out.print(first+" ");
           int third=first+second;
           first=second;
           second=third;
       }
    }
}
