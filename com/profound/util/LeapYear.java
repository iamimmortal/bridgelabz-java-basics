/***************************
*  Purpose: Determines  Whether year is leap year or not * 
*  @author  Dharmendra mourya
*  @version 1.0 
*  @since   06-08-2017 
* **************************/
package com.profound;
//import scanner class
import java.util.Scanner;
//import exeption class
import java.lang.NumberFormatException;

public class LeapYear 
{

        /*store year as input given by user*/
        int mInputYear;

    public static void main(String[] args) 
    {   

        //scanner class object
        Scanner in=new Scanner(System.in);
        //exception handling number format
        try
        {
            System.out.println("Enter a year");
            //taking input
            mInputYear=in.nextInt();
            //condition for leap year
            if(mInputYear<=1581)
            {
             System.out.println("Year not be less than 1582");
            }
            else
            {
             if(mInputYear%4==0 && mInputYear%100!=0||mInputYear%400==0)
             {
                System.out.println("Year is leap");
             }
             else
             {
                System.out.println("Not a leap year");
             }
            }
        }
        catch(NumberFormatException ex){
          System.out.println("Invalid input:"+ex.getMessage());}
         //condition year should be > than 1582
         
    }
}
