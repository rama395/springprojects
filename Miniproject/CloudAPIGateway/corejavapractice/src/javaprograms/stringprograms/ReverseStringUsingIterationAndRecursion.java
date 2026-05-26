package javaprograms.stringprograms;

public class ReverseStringUsingIterationAndRecursion {
    public static void main(String[] args) {
        String str = "goodmorning";
        String reversedStr = reverseStringUsingIteration(str);
        System.out.println("Reversed string using iteration is :" + reversedStr);
        String reversedStrUsingRecursion = reverseStringUsingRecursion(str);
        System.out.println("Reversed string using recursion is :" + reversedStrUsingRecursion);
    }

    private static String reverseStringUsingIteration(String str) {
        if (str == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
//str="goodmorning"
    //reverseStringUsingRecursion("oodmorning")+g
    //reverseStringUsingRecursion("odmorning")+o
//reverseStringUsingRecursion("dmorning")+o
    //reverseStringUsingRecursion("morning")+d
    //reverseStringUsingRecursion("orning")+m
    //reverseStringUsingRecursion("rning")+o
//reverseStringUsingRecursion("ning")+r
    //reverseStringUsingRecursion("ing")+n
//reverseStringUsingRecursion("ng")+i
    //reverseStringUsingRecursion("g")+n      return "gn"

    //return "g"


    private static String reverseStringUsingRecursion(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }


}
