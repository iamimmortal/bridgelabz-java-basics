/****************************************
   program:Coinflip and find percentage of head and tail
   Authur: Dharmendra mourya
   Version:1.0
   Date:10/08/17
  ******************************************/

package com.profound.util;

/*import lang to include maths functions*/
import java.lang.Math;

public class CoinFlip 
{

      //variable for user input number of trails
      int trails;
      //counters for head and tail
      int head=0;
      int tail=0;
      //user input
      int i;
    public static void main(String[] args) 
    {
     
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
        /*displaying result of operations*/
         System.out.println("Number of heads comes is:"+head);
         System.out.println("Number of tails comes is:"+tail);

         System.out.println("Percentage of head:"+(100*head/trails)+"%");
         System.out.println("Percentage of tails:"+(100*tail/trails)+"%")
    }
}
