package javaprograms;

public class NumberPalindrome {
    public static void main(String[] args) {
        int n = 121;
        int originalNum = n;
        int reverse = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        if (originalNum == reverse) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}

