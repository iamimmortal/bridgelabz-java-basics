/****************************************
 *Program:Squareroot using newtons method
 *Author: Dharmendra mourya
 *Version:1.0
 *Date:10/08/2017
*****************************************/
package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class SqrtNewtonMethod 
{

    public static void main(String[] args) 
    {
        //variable declarations to take number from user
        int numberInput;
        //temp variables
        double estimate;
        //relative error tolerence
        double epsilon=1e-15;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        numberInput=in.nextInt();
        //estimate is for estimation purpose
        estimate=numberInput;
        //if estimate is not equal to root
        //update estimate
        while(Math.abs(estimate-numberInput/estimate)>epsilon*estimate)
        {
            estimate=(estimate+numberInput/estimate)/2.0;
        }
        System.out.println(estimate);
    }
}
