package javaprograms.java8features.lambdaexpression.anonymousinnerclass;

public class WithAnonymousInnerClass
{
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++)
                {
                    System.out.println("child thread");
                }
            }
        });
        t.start();
        for (int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }

}
