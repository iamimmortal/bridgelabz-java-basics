/****************************************
   program:Factorial of a number
   Authur: Dharmendra mourya
   Version:1.0
   Date:10/08/17
  ******************************************/

package com.profound.util;

import java.util.Scanner;

public class Factorial
{

      /*store user input*/
      static int mUserInput;
      /*store returning value fro calculate*/
      static int mStoreReturnValue;

    public static void main(String[] args)
    { 

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
        /*store result of factorial*/
        static int factor=1;

    public int fact(int mUserInput)
     {
         
         while(mUserInput>0)
         {
            factor=factor*mUserInput;
            /*decreasing entered value by 1 after each calculatio*/
            mUserInput--;
         }
         //returning the calculated value
         return factor;
     }
}
