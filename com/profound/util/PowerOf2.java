/*************************************
    Program:Power of 2 that is >=2^n
    Author: Dharmendra Mourya
    Date:14/08/2017
**************************************/
package com.profound;

/*importing math class for inclusion of math function*/
import java.lang.Math;

public class PowerOf2 
{
    /*variable stores n from user as power */
    static int power;
    /*i control loop flow*/
    static int i;
    
    public static void main(String[] args) 
    {
        /*paraing user input through command line*/
        power=Integer.parseInt(args[0]);
        
        for(i=1;i<=power;i++)
        {
            System.out.println("2^"+i+"="+(int)(Math.pow(2,i)));
        }
    }
}
