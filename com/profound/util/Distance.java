/****************************************************************************** 
* Program: Euclidean distance* 
* Author:Dharmendra mourya*
* date:13/08/17*
******************************************************************************/

package com.profound.util;

//inclusion of math function
import java.lang.Math;

public class  Distance
{ 

    /*variable for storing two inputs from user*/
    int x,y;
    //variable for storing user input
    double distance;

  public static void main(String [] args)
  {
      //user command line input
      x=Integer.parseInt(args[0]);
      y=Integer.parseInt(args[0]);
      //operation
      distance=Math.sqrt(x*x+y*y);
      System.out.println("The distance is:"+distance);
  }

}
