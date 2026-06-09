package javaprograms.langpackage.passbyvaluepassbyreference;

public class PassByValue
{
    public static void main(String[] args) {
        int x=10;
        passByValuePrimitive(x);
        System.out.println(x);
        System.out.println("NON-PRIMITIVES");
        User u=new User();
        u.name="Rama";
        System.out.println(u.name);
        changeName(u);
        System.out.println(u.name);
        System.out.println("REASSIGNING");
        User u1=new User();
        u1.name="John";
        System.out.println(u1.name);
        reassign(u);
        System.out.println(u1.name);
    }
    private static void passByValuePrimitive(int num)
    {
        num=50;
    }
    private static void changeName(User user)
    {
        user.name="Devi";
    }
    private static void reassign(User testUser)
    {
        User user=new User();
        user.name="Smith";
    }
}
