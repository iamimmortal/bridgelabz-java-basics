package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class WindChill 
{

    public static void main(String[] args) 
    {   //2 variables
        float tempreture,velocity,temp;
        //scanner class
        Scanner in=new Scanner(System.in);
        //taking value of tempreture
        System.out.println("Enter tempreture in fareinheit:");
        tempreture=in.nextFloat();
        //taking value of velocity
        System.out.println("Enter velocity in miles:");
        velocity=in.nextFloat();
        //store pow of velocity
        temp=(float)Math.pow(velocity,0.16);
        //variable to store wind chil
        double windChill=(float)(35.74)+(0.6215*tempreture)+(0.4275*tempreture-35.75)*temp;
        //display result
        
        System.out.println("Windchill:"+windChill);
    }
}
