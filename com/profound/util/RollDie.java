/****************************************
 *Program:Roll die n times & find side which comes maximum*
 *Author: Dharmendra mourya*
 *Version:1.0*
 *Date:10/08/2017
*****************************************/
package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class RollDie 
{
    int result,trials;
        //counter for each number
        int one=0,two=0,three=0,four=0,five=0,six=0;


    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        trials=in.nextInt();
        while(trials>0)
        {
        result=(int)((Math.random()*6)+1);
        if(result==1)
        one++;
        else if(result==2)
        two++;
        else if(result==3)
        three++;
        else if(result==4)
        four++;
        else if(result==5)
        five++;
        else
        six++;
        trials--;
        }
        //largest falling side
        int array[]={one,two,three,four,five,six};
        int greatest=array[0];
        for(int i=0;i<5;i++)
        {
            if(array[i]>greatest)
            {
                greatest=array[i];
            }
        }
        System.out.println("The side which come maximum is:"+greatest);
    }
}
