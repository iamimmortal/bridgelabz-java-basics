package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class DayOfWeek 
{
  static  int dayInput,monthInput,yearInput;
   static  int storeReturnValue;

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        //take day as input
        dayInput=in.nextInt();
        //take month as input
        monthInput=in.nextInt();
        //take year as input
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

 class CalculateDayOfWeek 
{
    //function takes 3 argument to process
    int calculateDayOfWeek(int dayInput,int monthInput,int yearInput)
    {
        int storeYear,storeLeapYear,storeMonth,storeDay;
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

