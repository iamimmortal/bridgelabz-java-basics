/****************************************
   program:Trignometry
   Authur: Dharmendra mourya
   Version:1.0
   Date:11/08/17
  ******************************************/
package com.profound;

import java.lang.Math;
import java.util.Scanner;

public class Trigonometry 
{
       //variable to store degree as user input
       static double degree;
       //variable to store radians
       static double radian;
    public static void main(String[] args) 
    {
        //scan input
        Scanner in=new Scanner(System.in);
        System.out.println("Enter degree:");
        degree=in.nextDouble();
        //convert degree to radians
        radian=Math.toRadians(degree);
        //display sin and cos and tan values
        System.out.println("Sin("+radian+"):"+Math.sin(radian));
        System.out.println("Cos("+radian+"):"+Math.cos(radian));
        System.out.println("Tan("+radian+"):"+Math.tan(radian));
    }
}
