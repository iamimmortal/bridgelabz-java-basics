/****************************************
   program:Square root using overloaded method with error tolerence and without
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:18/08/17
  ******************************************/
package com.profound;

import java.util.Scanner;
import java.lang.Math;

public class SqrtOverloadedMethod 
{
  
  /*variable to store user provided number*/
   static double userInputNumber;
  /*variable to store epsilon*/
   static double epsilon;
   /*variable to store copy user provided number*/
   static double estimated;
   
  public static void main(String[] args) 
  {
     /*making object of scanner class*/
      Scanner in=new Scanner(System.in);
     /*making object of current class*/
      SqrtOverloadedMethod sm=new SqrtOverloadedMethod();
      /*initialization*/
      userInputNumber=in.nextDouble();
      epsilon=1e-15;
      System.out.println("Answer without error tolerator:"+sm.sqrt(userInputNumber));
      System.out.println("Answer with error tolerator:"+sm.sqrt(userInputNumber,epsilon));
  }
  //sqrt method without error tolerence
  public static double sqrt(double userInputNumber)
  {
     estimated=userInputNumber;
     //if estimated is not equal to root
     while(Math.abs(estimated-userInputNumber/estimated)>estimated)
     {
       estimated=(estimated+userInputNumber/estimated)/2.0;
     }
     return estimated;
  }
  //sqrt method with error tolerence
  public static double sqrt(double userInputNumber,double epsilon)
  {
    estimated=userInputNumber;
     //if estimated is not equal to root
     while(Math.abs(estimated-userInputNumber/estimated)>epsilon*estimated)
     {
       estimated=(estimated+userInputNumber/estimated)/2.0;
     }
     return estimated;
  }
}
