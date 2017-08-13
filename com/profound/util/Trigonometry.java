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

    public static void main(String[] args) 
    {
        //variable to store degree as user input
        double degree;
        //variable to store radians
        double radian;
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
