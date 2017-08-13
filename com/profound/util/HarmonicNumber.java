
/****************************************************************************** 
* Compilation: javac Harmonic.java*
* Execution: java Harmonic n * 
* Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n. * 
* Author:Dharmendra*
* date:10/08/17*
******************************************************************************/
package com.profound.util;

import java.util.Scanner;

public class HarmonicNumber 
{

    public static void main(String[] args) 
    {   //user input 
        int harmonicNumber,i;
        double harmonicValue=0.0;
        Scanner in=new Scanner(System.in);
        harmonicNumber=in.nextInt();
        for(i=1;i<=harmonicNumber;i++)
        {
            harmonicValue=harmonicValue+(1.0/i);
            //System.out.println(1.0/i);
           
        }
        System.out.println("Harmonic value is:"+harmonicValue);
    }
}
