/****************************************
   program:Sin of taylor series
   Authur: Dharmendra mourya
   Version:1.0
   Date:11/08/17
  ******************************************/
package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class Sin 
{

    public static void main(String[] args) 
    {
        //variable to control lenght of series
        int lenghtOfSeries;
        //get an angle from user 
        double x;
        //variable computes power of x
        int p=1;
        //assign sign + or -
        int sign=1;
        //calculate sum of series
        double sum=0.0;
        //for loop
        int i;
        //scan inputs
        Scanner in=new Scanner(System.in);
        System.out.println("Enter lenght of taylor series:");
        lenghtOfSeries=in.nextInt();
        System.out.println("Enter angle:");
        x=in.nextDouble();
        //convert x to be between -2PI to 2PI
        x=x%(2*Math.PI);
        for(i=1;i<=lenghtOfSeries;i++)
        {
            sum+=sign*(Math.pow(x,p)/fact(p));
            sign=-sign;
            p+=2;
        }
       // System.out.println("Sinx:"+sum);
        System.out.println("Sinx="+Math.sin(sum));
    }
    //calculate factorial
   public static int fact(int p)
   {
       int fact=1;
       if(p==0||p==1)
       {
           return 1;
       }
       else
       {
           while(p>0)
           {
               fact+=p;
               p--;
           }
           return fact;
       }
   }
}
