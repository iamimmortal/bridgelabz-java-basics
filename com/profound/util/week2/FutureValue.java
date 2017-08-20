/****************************************
   program:Future value
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:16/08/17
  ******************************************/
package com.profound;

import java.util.Scanner;
import java.lang.Long;
import java.lang.Math;

public class FutureValue 
{
   /*variable to store user entered amount*/
   static long amount;
   /*variable to store user entered rate of return*/
   static double rate;
   /*variable to store user entered time period*/
   static double time;
   
  public static void main(String[] args) 
  {
     /*Object of scanner class*/
      Scanner in=new Scanner(System.in);
     /*Object of current class*/
      FutureValue fv=new FutureValue();
     /*initialization*/
      System.out.println("Enter amount:");
      amount=in.nextLong();
      System.out.println("Enter rate of interest:");
      rate=in.nextDouble();
      System.out.println("Enter time:");
      time=in.nextDouble();
      //displaying result
      System.out.println("Future value:"+fv.futureValue(amount,rate,time));
  }
  /*Method to calculate future value*/
   public static double futureValue(long amount,double rate,double time)
   {
      double result=(1+rate);
      result=Math.pow(result,time);
      return result*amount;
   }
   
}
