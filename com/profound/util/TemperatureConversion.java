package com.profound;

import java.util.Scanner;

public class TemperatureConversion 
{

    public static void main(String[] args) 
    {
        double fareinheit,celcius;
        //store result
        double result;
        //user input as aoption
        int choice;
        Scanner in=new Scanner(System.in);
        System.out.println("1:Fareinheit to Celcius");
        System.out.println("2: Celcius to Fareinheit");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter fareinheit:");
                fareinheit=in.nextInt();
                result=(fareinheit-32)*5/9;
                System.out.println(result+" "+"degree celcius");
                break;
            }
            
            case 2:
            System.out.println("Enter celcius:");
                celcius=in.nextInt();
                result=(celcius*9/5)+32;
                System.out.println(result+" "+"degree fareinheit");
                break;
          
            default:
            {
                System.out.println("Invalid input");
            }
        }
        
    }
}
