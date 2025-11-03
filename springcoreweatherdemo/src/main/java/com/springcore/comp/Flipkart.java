package com.springcore.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart
{
    private Courier courier;
    //setter method
    public void setCourier(Courier courier)
    {
        System.out.println("Flipkart.setCourier()");
        this.courier=courier;
    }
    //Business method
    public String shopping(String items[],double prices[])
    {
        //calculate bill amount
        double billAmount=0.0;
        for(double p:prices)
        {
            billAmount=billAmount+p;
        }
        //generate the random number for order id
        int oid=new Random().nextInt(1000);
        //deliver the products using order id
        String msg= courier.deliver(oid);
        return Arrays.toString(items)+"items with billAmount::"+billAmount+"......"+msg;

    }
}
