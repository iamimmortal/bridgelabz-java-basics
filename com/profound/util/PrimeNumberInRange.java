
package com.profound.util;

import java.util.Scanner;


import java.util.Scanner;

public class PrimeNumberInRange 
{

    public static void main(String[] args) 
    {
        int range;
        //loop control 
        int c=2,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter range for prime number:");
        range=in.nextInt();
        for(i=1;i<=range;)
        {
            for(j=2;j<=c-1;j++)
            {
                if(c%j==0)
                   break;
            }
                if(j==c)
                {
                    System.out.println(c);
                    i++;
                }
            c++;
            }
            
        }
    }
