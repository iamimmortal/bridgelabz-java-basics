/****************************************
   program:Prime checker using function/methods
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:17/08/17
  ******************************************/
package com.profound;

import java.util.Scanner;

public class PrimeChecker 
{

   /*Number from user to check for primeNumber*/
   static int primeNumber;
   /*variables to control loops*/
   static int i;
   /*flag variable*/
   static int flag=0;
   /*main function or Entry point*/
  public static void main(String[] args) 
  {
    /*Current class object*/
    PrimeChecker pc=new PrimeChecker();
    Scanner in=new Scanner(System.in);
    primeNumber=in.nextInt();
    System.out.println("The Number is prime:"+pc.isPrime(primeNumber));
  }
  /*Method to check for prime*/
   public boolean isPrime(int primeNumber)
   {    
      if(primeNumber>2)
      {
         for(i=3;i*i<=primeNumber;i++)
         {
           if(primeNumber%i==0)
           {
             flag=1;
             break;
           }
         }
         
       /*Decision according to flag variable*/
       if(flag==1) 
       {
         return false;
       }
       else
       {
         return true;
       }
      }
      else
      {
        return true;
      }
   }
}
