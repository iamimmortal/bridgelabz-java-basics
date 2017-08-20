/****************************************
   program:Min max value from array using method
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:17/08/17
  ******************************************/
package com.profound;

import java.util.Scanner;
import java.lang.String;

public class MinMaxStringArray 
{
   /*string array variable*/
   static  String[] stringArray;
   /*variable i to control loop*/
   static int i;
   
  public static void main(String[] args) 
  {
     /*object of override chid  class*/
      Override o=new Override();
     /*object of scanner class*/
      Scanner in=new Scanner(System.in);
      /*taking array elemnt from user*/
      /*initializing string array array*/
       stringArray=new String[] {"the","dharmu","nanu","java","interstellar"};
      //displaying result
      System.out.println("Min string:"+o.minValue(stringArray));
      System.out.println("Max string:"+o.maxValue(stringArray));
  }
  /*min value method*/
    public static String maxValue(String[] stringArray)
    {
      /*temporary variable*/
       int temp;
       String s;
       temp=stringArray[0].length();
       s=stringArray[0];
       for(i=1;i<5;i++)
       {
           if(temp<stringArray[i].length())
           {
             s=stringArray[i];
             temp=stringArray[i].length();
           }
       }
       return s;
         
    }
     /*max value method*/
    public static String minValue(String[] stringArray)
    {
      
       /*temporary variable*/
         int temp;
       String s;
       temp=stringArray[0].length();
       s=stringArray[0];
       for(i=1;i<5;i++)
       {
           if(temp>stringArray[i].length())
           {
             s=stringArray[i];
             temp=stringArray[i].length();
           }
       }
       return s;
         
      }
}
//new class
class Override extends MinMaxStringArray
{
  /*min value method*/
    public static String maxValue(String[] stringArray)
    {
      /*temporary variable*/
       int temp;
       String s;
       temp=stringArray[0].length();
       s=stringArray[0];
       for(i=1;i<5;i++)
       {
           if(temp<stringArray[i].length())
           {
             s=stringArray[i];
             temp=stringArray[i].length();
           }
       }
       return s;
         
    }
     /*max value method*/
    public static String minValue(String[] stringArray)
    {
      
       /*temporary variable*/
         int temp;
       String s;
       temp=stringArray[0].length();
       s=stringArray[0];
       for(i=1;i<5;i++)
       {
           if(temp>stringArray[i].length())
           {
             s=stringArray[i];
             temp=stringArray[i].length();
           }
       }
       return s;
         
     }
  
}
