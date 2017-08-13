package com.profound;
//separate class for calculation
public class CalculateDayOfWeek 
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
