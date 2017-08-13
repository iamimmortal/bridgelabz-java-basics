/****************************************
 *Program:prime factor*
 *Author: Dharmendra mourya*
 *Version:1.0*
 *Date:10/08/2017
*****************************************/
package com.profound.util;

public class PrimeFactor 
{
    static   int number;
     //counter 
    static int ctr=0;
  /*controlling loop*/
    static int i,j;
  public static void main(String [] args)
  {
     number=Integer.parseInt(args[0]);
      for(i=1;i*i<=number;i++)
      {
        if(number%i==0)
        {
           for(j=1;j<i-1;j++)
           {  
               if(i%j==0)
                {
                 continue;
                }
               else
                {
                   System.out.println(i);
                }
             
           }

        }
     }
  }
}
