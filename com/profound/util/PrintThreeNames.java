/*************************************
    Program:print three names in a single sentence
    Author: Dharmendra Mourya
    Date:14/08/2017
**************************************/
package com.profound;

import java.util.Scanner;
import java.lang.String;

public class PrintThreeNames 
{

     /*array variable for storing three names*/
     static String name1,name2,name3;
     //Entry point
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        //initialization of names from user
        name1=in.nextLine();
        name2=in.nextLine();
        name3=in.nextLine();
        /*Entering elemnts into array*/
        System.out.println("Hi,"+name3+","+name2+" and "+name1);
    }
}
