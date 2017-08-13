
/****************************************
   program:Gambler simulation 
   Authur: Dharmendra mourya
   Version:1.0
   Date:11/08/17
  ******************************************/
package com.profound.util;

import java.util.Scanner;
import java.lang.Math;

public class GamblingSimulator
{

    public static void main(String[] args) 
    {
        //variable to store stake,goal,traials
        int stake,goal,trails;
        //counter to keep track on bets and cash win and lose
        int bets=0;
        int wins=0;
        //variable for loop control
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your stake:");
        stake=in.nextInt();
        System.out.println("Enter your goal:");
        goal=in.nextInt();
        System.out.println("Enter your trails:");
        trails=in.nextInt();
        for(i=1;i<=trails;i++)
        {
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
