
/*******************************
  Program:stop watch with user defined library
  Authur:Dharmendra Mourya
  Date:19/08/17
 *******************************/
package com.profound;

/*user defined library*/
import com.bridgelabz.lib.blLib;

public class StopWatch
{
  static double time1,time2;
  public static void main(String[] args) 
  {  
     time1=blLib.stopWatch();
     System.out.println(time1);
     for(int i=1;i<=50000000;)
     {
       i++;
     }
     time2=blLib.elapsedTime(time1);
     System.out.println(time2);
  }
}
