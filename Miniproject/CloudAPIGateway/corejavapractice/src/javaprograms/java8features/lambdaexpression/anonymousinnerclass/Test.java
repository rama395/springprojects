package javaprograms.java8features.lambdaexpression.anonymousinnerclass;

public class Test
{
    int x=70;
    public void m2()
    {
        Interf i=()->{
            int x=80;
            System.out.println(x);
            System.out.println(this.x);
        };
        i.m1();
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.m2();
    }
}
