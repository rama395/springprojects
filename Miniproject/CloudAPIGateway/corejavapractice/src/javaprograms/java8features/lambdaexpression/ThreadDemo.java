package javaprograms.java8features.lambdaexpression;

public class ThreadDemo
{
    public static void main(String[] args) {
        Runnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        for (int i=0;i<100;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
