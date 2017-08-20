/*******************************
  Program:Standard output with user defined library
  Authur:Dharmendra Mourya
  Date:19/08/17
 *******************************/
package com.profound;

/*user defined library*/
import com.bridgelabz.lib.blLib;
 
public class BLStdOut 
{

  public static void main(String[] args) 
  {
    /*simple print statement without new line*/
     blLib.print("Shirley");
    /*simple new line*/
     blLib.println();
    /*simple print statement with new line*/
     blLib.println("Shirley");
    /*simple print with 2 argument*/
     blLib.printf("Dharmendra", "Shirley");
  }
}
