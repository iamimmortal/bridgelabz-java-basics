package com.profound;

import java.lang.Long;
import java.util.Scanner;

public class Factorial
{

    public static void main(String[] args)
    { 
        /*store user input*/
         int mUserInput;
         /*store returning value fro calculate*/
         int mStoreReturnValue;
        /*scanner class to scan input*/
          Scanner in=new Scanner(System.in);
          //takes user input through keyboard
           mUserInput=in.nextInt();
         /*creating object of class calculate*/
             Calculate c=new Calculate();
              mStoreReturnValue=c.fact(mUserInput);
              System.out.println(mStoreReturnValue);
    }
}
/*class to calculate factorial and return*/
class Calculate
{
    public int fact(int mUserInput)
    { /*store result of factorial*/
          int factor=1;
        while(mUserInput>0)
        {
        factor=factor*mUserInput;
       /*decreasing entered value by 1 after
        each calculatio*/
        mUserInput--;
        }
        //returning the calculated value
        return factor;
    }
}
