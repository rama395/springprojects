package com.singletonclass;

public class Printer
{
    private static Printer INSTANCE;
    //private constructor
    private Printer()
    {
        System.out.println("Printer:0-param constructor");
    }
    //static factory method having singleton logic
    public static Printer getINSTANCE()
    {
        if(INSTANCE==null)
        {
            INSTANCE=new Printer();
        }
        return INSTANCE;
    }
    //business method
    public void printMessage(String msg)
    {
        System.out.println(msg);
    }
}
