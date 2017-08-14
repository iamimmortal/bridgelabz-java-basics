/*************************************
    Program:prime number according to user define range
    Author: Dharmendra Mourya
    Date:13/08/2017
**************************************/
package com.profound.util;

import java.util.Scanner;

public class PrimeNumberInRange 
{      
        //user provided range
        static int range;
        //loop control 
        static int c=2,i,j;

    public static void main(String[] args) 
    {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter range for prime number:");
        range=in.nextInt();
        for(i=1;i<=range;)
        {
            for(j=2;j<=c-1;j++)
            {
                //if divide then break loop 
                if(c%j==0)
                   break;
            }
                if(j==c)
                {
                    System.out.println(c);
                    //i is incremented only if number divide by itself
                    i++;
                }
            //number increment
            c++;
            }
            
        }
    }
