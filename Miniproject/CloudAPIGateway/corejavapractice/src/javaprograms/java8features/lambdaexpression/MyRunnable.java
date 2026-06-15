package javaprograms.java8features.lambdaexpression;

public class MyRunnable implements Runnable
{
    public void main()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }

    @Override
    public void run() {
        System.out.println("Run method");
    }
}
