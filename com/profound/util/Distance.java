/****************************************************************************** 
* Program: Euclidean distance* 
* Author:Dharmendra mourya*
* date:13/08/17*
******************************************************************************/

package com.profound.util;

import java.lang.Math;

public class  Distance
{
 public static void main(String [] args)
 {
  /*variable for storing two inputs from user*/
     int x,y;
    //variable for storing user input
     double distance;
     //user command line input
     x=Integer.parseInt(args[0]);
     y=Integer.parseInt(args[0]);
    //operation
    distance=Math.sqrt(x*x+y*y);
   System.out.println("The distance is:"+distance);
  }
}
