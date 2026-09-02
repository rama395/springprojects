package javaprograms.java8features.lambdaexpression;

//without lambda expression
//public class Test
//{
//        public static void main(String[] args) {
//            Interface i=new Interface.Demo();
//            i.methodOne();
//        }
//}

//with lambda expression
public class Test
{
    public static void main(String[] args) {
        Interface i=()-> System.out.println("method one execution with lambda expression");
        i.methodOne();
    }
}
