/**********************************
Program: sum of two dice
Author: Dharmendra mourya
Date:12/08/17
************************************/
packagepackage com.profound.util;

import java.lang.Math;

public class SumOfTwoDice 
{
    //Variable to store two dice result
     static double d1,d2;
    public static void main(String[] args) 
    {
        System.out.println("Rolling dice 1...");
        d1=(int)(Math.random()*6+1);
        System.out.println("Rolling dice 2...");
        d2=(int)(Math.random()*6+1);
        System.out.println("Sum:"+(int)(d1+d2));
    }
}
