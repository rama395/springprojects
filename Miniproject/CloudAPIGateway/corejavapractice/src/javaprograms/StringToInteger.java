package javaprograms;

public class StringToInteger
{
    public static void main(String[] args) {
        String str = "12345";
        int num = Integer.parseInt(str,8);
        System.out.println("The integer value is: " + num);
    }
}
