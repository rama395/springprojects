package javaprograms.inheritance;

class Example1
{
        public Example1(String name)
	   {
		   System.out.println("Param const constructor of :"+name);
	   }

        	   // parameterized constructor
                public Example1(int x)
	   {
		   this("java");
		   System.out.println("param const.. of x value is:"+x);
	   }
}

public class CallingParamConstructor
{
    public static void main(String[] args) {
        new Example(10);
    }
}
