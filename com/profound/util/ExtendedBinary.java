/****************************************
   program:Decimal2binary extende with following operation
           1-swap to nibbles
           2-concat nibblrs and find result
   Authur: Dharmendra mourya
   Version:1.0
   Date:10/08/17
  ******************************************/
package com.profound.util;

import java.util.Scanner;

public class ExtendedBinary 
{

    public static void main(String[] args) 
    {
        int decimalNumber;
        //temp count lenght of division on number
        int temp=0;
        //For incrment of array
        int i=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter decimal number:");
        decimalNumber=in.nextInt();
        //array to store bit value
        int array[]=new int[8];
        //following is for storing nibble
        int n1[]=new int[4];
        int n2[]=new int[4];
        //following counter is for nibble
        int a=0;
        int b=0;
        //decomposing number
        while(decimalNumber>0)
        {
            array[i]=decimalNumber%2;
            decimalNumber/=2;
            temp++;
            i++;
        }
        array[i++]=0;
        temp++;
        /*displaying decimal number to binary
         and putting values in nibble array*/
       for(i=temp-1;i>=0;i--)
       {
           if(i>3)
           {
               n1[a]=array[i];
               a++;
           }
           else
           {
               
               n2[b]=array[i];
               b++;
           }
           System.out.print(array[i]);
       }
       System.out.println();
       System.out.println(" resultant array after swapping nibble");
 /*resultant array after swapping nibble */
       /*output nibble bits*/
       //swaped nible n1n2 to n2n1
       //nibble 1st
           i=0;
           for(i=0;i<4;i++)
           {
               System.out.print(n2[i]);
           }
             //nibble 2nd
           i=0;
           for(i=0;i<4;i++)
           {
               System.out.print(n1[i]);
           }
    }
}
