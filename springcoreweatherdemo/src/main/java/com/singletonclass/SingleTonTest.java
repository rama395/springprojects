package com.singletonclass;

public class SingleTonTest
{
    public static void main(String[] args) {
        //get printer object
        Printer p1=Printer.getINSTANCE();
        Printer p2=Printer.getINSTANCE();
        System.out.println(p1.hashCode()+" "+p2.hashCode());
        System.out.println("(p1==p2) is "+(p1==p2));

    }
}
