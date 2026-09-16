package javaprograms.stringprograms;

import java.util.regex.Pattern;

public class StringIsDigitP
{
    public static void main(String[] args) {
        String str="r2ama";
       Pattern pattern=Pattern.compile(".*[0-9].*");
       if (pattern.matcher(str).matches())
       {
           System.out.println("Given string contain digits");
       }
       else{
           System.out.println("does not contain digits");
       }

    }
}
