 /****************************************
   program:Decimal2binary
   Authur: Dharmendra mourya
   Version:1.0
   Date:10/08/17
  ******************************************/
package com.profound.util;
 /*importing scanner class for taking userinput*/
import java.util.Scanner;

public class Binary 
{ 
    static int decimalNumber;
    //temp count lenght of division on  number
    int temp=0;
    //for incrment of array
    int i=0;
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter decimal number:");
        decimalNumber=in.nextInt();
        //array to store bit value
        int array[]=new int[10];
        //decomposing number
        while(decimalNumber>0)
        {
            array[i]=decimalNumber%2;
            decimalNumber/=2;
            temp++;
            i++;
        }
        //displaying decimal number to binary
       for(i=temp-1;i>=0;i--)
       {
           System.out.print(array[i]);
       }
    }
}
