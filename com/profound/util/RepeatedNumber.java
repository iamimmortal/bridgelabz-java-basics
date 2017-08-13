package com.profound.util;

import java.util.Scanner;

public class RepeatedNumber 
{

    public static void main(String[] args) 
    {
        int i,j;
        int array[]=new int[10];
        Scanner in=new Scanner(System.in);
        for(i=0;i<=9;i++)
        {
            array[i]=in.nextInt();
            
        }
        for(i=1;i<=10;i++)
        { int c=0;
            for(j=0;j<=9;j++)
            {
                if(i==array[j])
                {
                 
                   c++;
                    
                }
            }
            if(c>1)
            {
            
            System.out.println("The Number:"+i+"repeated "+c+"times");
            System.out.println();
            }
        }
    }
}
