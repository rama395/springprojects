package javaprograms.java8features.methodreference;

public class Test
{
    public void m2(int i)
    {
        System.out.println("From method reference:"+i);
    }

    public static void main(String[] args) {
        interf f=i-> System.out.println("lambda expression:"+i);
        f.m1(10);
        Test t=new Test();
        interf i1=t::m2;
        i1.m1(20);
    }
}
