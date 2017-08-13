package com.profound;

import java.lang.Math;

public class SumOfTwoDice 
{

    public static void main(String[] args) 
    {
        double d1,d2;
        
        System.out.println("Rolling dice 1...");
        d1=(int)(Math.random()*6+1);
        System.out.println("Rolling dice 2...");
        d2=(int)(Math.random()*6+1);
        System.out.println("Sum:"+(int)(d1+d2));
    }
}
