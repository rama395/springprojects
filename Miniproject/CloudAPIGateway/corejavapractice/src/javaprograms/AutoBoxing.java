package javaprograms;

public class AutoBoxing {


    public static void main(String[] args) {

        Integer i = Integer.valueOf(12);
        System.out.println(i);
        String str = "234";
        Integer intObj = Integer.valueOf(str);
        System.out.println(intObj);
        System.out.println(".............................");
        String str2 = "12";
        Integer i1 = Integer.valueOf(str2,36);
        System.out.println(i1);

        String str1 = "add";
        Integer i2 = Integer.valueOf(str1,16);
        System.out.println(i2);


    }
}









