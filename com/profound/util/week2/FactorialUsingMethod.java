/****************************************
   program:To find factorial of n using method
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:16/08/17
  ******************************************/
package com.profound;

import java.lang.Long;

public class FactorialUsingMethod 
{

  /*variable to store user input n*/
    static int userInput;
   /*long variable store result of factorial*/
    static long factResult;
    
  public static void main(String[] args) 
  {
     userInput=Integer.parseInt(args[0]);
     /*object of current class*/
     FactorialUsingMethod fum=new FactorialUsingMethod();
     /*printing result of factorial.*/
     System.out.println("Factorial:"+fum.factorial(userInput));
  }
  //function to calculate factorial
  public static long factorial(int userInput)
  {
    /*initializing factResult*/
      factResult=1;
    if(userInput==0||userInput==1)
    {
      return 1;
    }
    else
    {
      while(userInput>0)
      {
        factResult=factResult*userInput;
        userInput--;
      }
      return factResult;
    }
  }
}
