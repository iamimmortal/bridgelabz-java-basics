/****************************************
   program:Day of week using function
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:17/08/17
  ******************************************/
package com.profound;

import java.lang.Math;
import java.util.Scanner;

public class DayOfWeekUsingMethod
{

    /*variable store day,month,year from user*/
     static int dayInput,monthInput,yearInput;
     /*variable to store return value from user*/
     static int storeReturnValue;
     
    public static void main(String[] args) 
    {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter day:");
        //take day as input from user
        dayInput=in.nextInt();
        System.out.println("Enter month:");
        //take month as input from user
        monthInput=in.nextInt();
        System.out.println("Enter year:");
        //take year as input from user
        yearInput=in.nextInt();
        //take return value from call function
        CalculateDayOfWeek cdw=new CalculateDayOfWeek();
        
        storeReturnValue=cdw.calculateDayOfWeek(dayInput,monthInput,yearInput);
        //codition for loop
     
        switch(storeReturnValue)
        {
            case 0:
            System.out.println("SUNDAY");
            break;
            
            case 1:
            System.out.println("MONDAY");
            break;
            
            case 2:
            System.out.println("TUESDAY");
            break;
            
            case 3:
            System.out.println("WEDNESDAY");
            break;
            
            case 4:
            System.out.println("THURSDAY");
            break;
            
            case 5:
            System.out.println("FRIDAY");
            break;
            
            case 6:
            System.out.println("SATURDAY");
            break;
        }
    }
}
//class for calculation
class CalculateDayOfWeek 
{    
     /*variable to store year calculation*/
     static int storeYear;
     /*variable to store leap year calculation*/
     static int storeLeapYear;
     /*variable to store month calculation*/
     static int storeMonth;
     /*variable to store day calculation*/
     static int storeDay;
     
    //function takes 3 argument to process
    int calculateDayOfWeek(int dayInput,int monthInput,int yearInput)
    {
        //calculate year
        storeYear=yearInput-(14-monthInput)/12;
        //calculate laep year
        storeLeapYear=storeYear+(storeYear/4)-(storeYear/100)+(storeYear/400);
        //calculate month
        storeMonth=monthInput+12*((14-monthInput)/12)-2;
        //calculate days
        storeDay=(dayInput+storeLeapYear+31*storeMonth/12)%7;
        //return day
        return storeDay;
    }
}



