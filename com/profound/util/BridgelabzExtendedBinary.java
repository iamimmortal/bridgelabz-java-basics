/***********************************************
 Program:Extended Binary swapping nibbles to from new number
 Author:Dharmendra mourya
 Date:13/08/17
*************************************************/
package com.profound.util;

/*importing lang  class for math function */
import java.lang.Math;

public class BridgelabzExtendedBinary
{   
    //taking user input through comand line
    static int decimalNumber;
    //counter for incresing array count
    static int i=0;
    static int j;
    //counter to count lenght of array
    static int temp=0;
    /*array to store bit value*/
    static int binary[]=new int[8]; 
    static int newarray[]=new int[8];
    /*following is for storing nibble*/
    static int nibble1[]=new int[4];
    static int nibble2[]=new int[4];
    //following counter is for nibble
    static int a=0;
    static int b=0;
    static int z=0;
    //storing result from binary to decimal conversion
    static double result=0;
      //entry point
      public static void main(String [] args)
      {
          decimalNumber=Integer.parseInt(args[0]);
          //decomposing number
          while(decimalNumber>0)
          {
            binary[i]=decimalNumber%2;
            decimalNumber/=2;
            temp++;
            i++;
          }
          while(i<=7)
          {
           binary[i]=0;
           i++;
           temp++;
          }
          /*displaying decimal number to binary and putting values in nibble array*/
          for(i=temp-1;i>=0;i--)
          {
             if(i>3)
             {
               nibble1[a]=binary[i];
               a++;
             }
             else
             {

               nibble2[b]=binary[i];
               b++;
             }
              /*printing binary bits*/
              System.out.print(binary[i]);
         }

          System.out.println();
          System.out.println("resultant array after swapping nibble");
         //printing nibbles
         for(i=0,j=0;i<4;i++,j++)
         {
            newarray[j]=nibble2[i];
            System.out.print(nibble2[i]);
            
         }
         for(i=0,j=4;i<4;i++,j++)
         {  
            newarray[j]=nibble1[i];
            System.out.print(nibble1[i]);
         }
         System.out.println();
        
        //binary to decimal
        for(i=7;i>=0;i--)
        {
        //  System.out.println("hey");
           if(newarray[i]==0)
           { 
             z++;
           }
           else
           {
             result=result+Math.pow(2,z);
             z++;
           }
        }
       //result after binary to decimal
       System.out.println();
       System.out.println("Sum:"+result);
      }
} 
