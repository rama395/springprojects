package javaprograms.inheritance;


class Example {
    public Example() {
        System.out.println("No-argument constructor");
    }

    // parameterized constructor
    public Example(int x) {
        this();
        System.out.println("param const.. of x value is:" + x);
    }
}

class Test extends Example {
    public Test(int y) {
        super(5);
        System.out.println("param const.. of y value is:" + y);
    }
}

public class CallingConstructor {
    public static void main(String[] args) {
        new Test(10); // Nameless object
    }
}

