/****************************************
 *Program:Repeated number between 1 to 100*
 *Author: Dharmendra mourya*
 *Version:1.0*
 *Date:10/08/2017
*****************************************/

package com.profound.util;

import java.util.Scanner;

public class RepeatedNumber 
{  
     //loop control variable
     static int i,j;
     //variable to store the occurrence of repeated number
     static int counter;
    public static void main(String[] args) 
    {
        //Array to store 100 numbers
        int array[]=new int[100];
        Scanner in=new Scanner(System.in);
        for(i=0;i<=99;i++)
        {
            array[i]=in.nextInt();
        }
        for(i=1;i<=100;i++)
        { 
            counter=0;
            for(j=0;j<=99;j++)
            {
                if(i==array[j])
                {
                   counter++;
                }
            }
            //If number is repeated then counter will be greater than one
            if(counter>1)
            {
            
            System.out.println("The Number:"+i+"repeated "+counter+"times");
            System.out.println();
            }
        }
    }
}
