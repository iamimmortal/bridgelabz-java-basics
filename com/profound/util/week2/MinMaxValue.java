/****************************************
   program:Min max value from array using method
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:17/08/17
  ******************************************/
package com.profound;

import java.util.Scanner;

public class MinMaxValue 
{
  /*variable to store size of  array*/
   static int arraySize;
   /*array variable*/
   static int array[]=new int[5];
   /*variable i to control loop*/
   static int i;
   
  public static void main(String[] args) 
  {
     /*object of current class*/
      MinMaxValue mmv=new MinMaxValue();
     /*object of scanner class*/
      Scanner in=new Scanner(System.in);
      /*taking array elemnt from user*/
      /*initializing size of array*/
       System.out.println("Enter array size;");
       arraySize=in.nextInt();
      for(i=0;i<arraySize;i++)
      {
         System.out.println("Enter element for position:"+(i+1));
         array[i]=in.nextInt();
      }
      //displaying result
      System.out.println("Min value:"+mmv.minValue(array));
      System.out.println("Max value:"+mmv.maxValue(array));
  }
  /*min value method*/
    public static int maxValue(int array[])
    {
      /*temporary variable*/
       int temp;
       temp=array[0];
       for(i=1;i<arraySize;i++)
       {
           if(temp<array[i])
           {
             temp=array[i];
           }
       }
       return temp;
         
    }
     /*max value method*/
    public static int minValue(int array[])
    {
      
       /*temporary variable*/
        int temp;
        temp=array[0];
       for(i=1;i<arraySize;i++)
       {
           if(temp>array[i])
           {
             temp=array[i];
           }
       }
       return temp;
    }
}
