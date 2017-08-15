/*************************************
    Program:Spring season
    Author: Dharmendra Mourya
    Date:14/08/2017
**************************************/
package com.profound;

import java.util.Scanner;

public class SpringSeason 
{
    //variable to store day and month from user
    static int monthInput,dayInput;
    
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        /*Initialization of variable*/
        monthInput=in.nextInt();
        dayInput=in.nextInt();
        //condition to check
        if((monthInput>=3)&&(monthInput<=6))
        {
            if(monthInput==3&&dayInput>=20)
            {
                System.out.println("Spring Season");
            }
            else if(monthInput==3&&dayInput<20)
            {
                System.out.println("Not Spring Season");
            }
            else if(monthInput==6&&dayInput>=20)
            {
                System.out.println("Spring Season");
            }
            else if(monthInput==6&&dayInput<20)
            {
                System.out.println("Not Spring Season");
            }
            else
            {
            System.out.println("Spring Season");
            }
        }
        else
        {
            System.out.println("Not a spring season");
        }
    }
}
