/*************************************
    Program:Prime factors
    Author: Dharmendra Mourya
    Date:15/08/2017
**************************************/
package com.profound;

import java.util.Scanner;

public class PrimeFactor 
{
    
    /*variable to store user input*/
    static int primeNumber;
    /*variable to control loop*/
    static int i;
    
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        //initialization
        primeNumber=in.nextInt();
        /*First all of convert even number to 
        odd by dividing it with 2 so that after printing
        2 the value remain in prime number must be odd*/
        while(primeNumber%2==0)
        {
            /*if number is even then it must be divisible 
            by 2 and 2 is even prime number so 2 is printed*/
            System.out.print("2\t");
            primeNumber=primeNumber/2;
        }
        /*loop is started with 3 because 2 is already printed
        if number is even and every time i is incremented 
        by 2 to maintain its odd state because even number 
        except 2 is never a prime number*/
        /*i*i<=prime is for efficiency to prevent i from 
         each number*/
        for(i=3;i*i<=primeNumber;i=i+2)
        {
            /**/
            while(primeNumber%i==0)
            {
                System.out.print(i+"\t");
                primeNumber/=i;
            }
        }
        /*number is printed if greater than 2 because
        if number is 2 then it is already printed*/
        if(primeNumber>2)
        {
            System.out.print(primeNumber);
        }
        
    }
}
