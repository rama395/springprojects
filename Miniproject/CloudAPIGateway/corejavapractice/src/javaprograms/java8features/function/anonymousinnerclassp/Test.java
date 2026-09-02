package javaprograms.java8features.function.anonymousinnerclassp;

//with anonymous inner class
public class Test
{
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<10;i++)
                {
                    System.out.println("Child Thread");
                }
            }
        });
        t.start();
        for (int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }
    }
}
