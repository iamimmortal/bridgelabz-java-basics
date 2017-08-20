/*******************************
  Program:Standard statistics with user defined library
  Authur:Dharmendra Mourya
  Date:19/08/17
 *******************************/
package com.profound;

/*user defined library*/
 import com.bridgelabz.lib.blLib;
 
public class BLStats 
{ 
  /*array declaration and initialization */
  static double[] array=new double[] {1,2,3,4,5,6,7};
  public static void main(String[] args) 
  {  
     /*minimum of array*/
     System.out.println(blLib.min(array));
     /*maximum of array*/
     System.out.println(blLib.max(array));
     /*mean*/
     System.out.println(blLib.mean(array));
     /*variance*/
     System.out.println(blLib.var(array));
     /*std deviation*/
     System.out.println(blLib.std(array));
  }
}
