
/****************************************
   program:Gambling simulation by taking 3 input and count number of wins and lose
   Authur: Dharmendra mourya
   Version:1.0
   Date:11/08/17
  ******************************************/
package com.profound.util;

//lang.math for inclusion of math function
import java.util.Scanner;
import java.lang.Math;

public class GamblingSimulator
{

       //variable to store stake,goal,traials
       static  int stake,goal,trails;
       //counter to keep track on bets and cash win and lose
       static  int bets=0;
       static  int wins=0;
       //variable for loop control
       static  int i;

    public static void main(String[] args) 
    {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your stake:");
        stake=in.nextInt();
        System.out.println("Enter your goal:");
        goal=in.nextInt();
        System.out.println("Enter your trails:");
        trails=in.nextInt();
        for(i=1;i<=trails;i++)
        { 
            /*cash will reset for every i++*/
            int cash=stake;
            while(cash>0 && cash<goal)
            {
                bets++;
                if(Math.random()<0.5)
                {
                    cash++;
                }
                else
                {
                    cash--;
                }
            }
            if(cash==goal)
            {
                wins++;
            }
        }
         System.out.println(wins+" Out of total "+trails);
         System.out.println("Percent of wins:"+100.0*wins/trails+"%");
         System.out.println("Average bets:"+(int)(1.0*bets/trails));
    }
}
