package javaprograms.stringprograms;

import java.util.regex.Pattern;

public class StringIsDigit
{
    public static void main(String[] args) {
        String str="rama";
        Pattern pattern = Pattern.compile(".*[0-9].*");
        //Pattern pattern=Pattern.compile(".*\\D.*");
        if(pattern.matcher(str).matches())
        {
            System.out.println("String contain digits");
        }
        else {
            System.out.println("String does not contain digits");
        }

    }
}
