package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class CarLoanPayment 
{

    public static void main(String[] args) 
    {
        //variable declaration
        float principle,year,rate,r,payment;
        float time;
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
