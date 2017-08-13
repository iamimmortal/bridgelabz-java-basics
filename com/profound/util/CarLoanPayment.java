 /****************************************
   program:car loan payment
   Authur: Dharmendra mourya
   Version:1.0
   Date:10/08/17
  ******************************************/

package com.profound.util;

/*importing math and scanner class for math and user input function*/
import java.lang.Math;
import java.util.Scanner;

public class CarLoanPayment 
{
   //variable declaration for taking user input
   static  float principle,year,rate,r,payment;
   //take time as value from user
   static  float time;
    public static void main(String[] args) 
    {
        //defining scanner class for user input
        Scanner in=new Scanner(System.in);
        //principle amount input
        principle=in.nextFloat();
        //no of year amount input
        year=in.nextFloat();
        //Rate of  amount input
        rate=in.nextFloat();
        //calculate time duration of payment
        time=(12*year);
        //calculate rate %
        r=rate/(12*100);
        //calculating payment
        payment=(float)((principle*r)/(1-(Math.pow((1+r),-time))));
        //display value
        System.out.println("payment:"+payment);
    }
}
