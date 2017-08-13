package com.profound.util;

import java.lang.Math;

public class CoinFlip 
{

    public static void main(String[] args) 
    {
       //variable for user input number of trails
        int trails;
       //counters for head and tail
       int head=0;
       int tail=0;
      //user input
      int i;
      trails=Integer.parseInt(args[0]);
       for(i=1;i<=trails;i++)
       {
         if(Math.random()<0.5)
         {
            head++;
         }
         else
         {
            tail++;
         }
      }
         System.out.println("Number of heads comes is:"+head);
         System.out.println("Number of tails comes is:"+tail);

        System.out.println("Percentage of head:"+(100*head/trails)+"%");
         System.out.println("Percentage of tails:"+(100*tail/trails)+"%");

    }
}
