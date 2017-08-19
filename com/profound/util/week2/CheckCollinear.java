/****************************************
   program:Check collinear using slope and area
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:17/08/17
  ******************************************/
package com.profound;

import java.util.Scanner;

public class CheckCollinear 
{
  /*variable to store 1st point xy-cordinate*/
   static int x1,y1;
   /*variable to store 2nd point xy-cordinate*/
   static int x2,y2;
   /*variable to store 3rd point xy-cordinate*/
   static int x3,y3;
   /*Variable to store 3 slopes*/
   static int AB,BC,AC;
   /*variable to store area*/
   static int area;
   
  public static void main(String[] args) 
  {
     CheckCollinear cc=new CheckCollinear();
     Scanner in=new Scanner(System.in);
     System.out.println("Consider three points as ABC:");
     System.out.println("Enter x1:");
     x1=in.nextInt();
     System.out.println("Enter y1:");
     y1=in.nextInt();
     System.out.println("Enter x2:");
     x2=in.nextInt();
     System.out.println("Enter y2:");
     y2=in.nextInt();
     System.out.println("Enter x3:");
     x3=in.nextInt();
     System.out.println("Enter y3:");
     y3=in.nextInt();
     System.out.println("Collinear using slope:"+cc.checkCollinearUsingSlope(x1,y1,x2,y2,x3,y3));
     System.out.println("Collinear using area:"+cc.checkCollinearUsingArea(x1,y1,x2,y2,x3,y3));
  }
  /*method for finding collinear using slope method*/
   public static boolean checkCollinearUsingSlope(int x1,int y1,int x2,int y2,int x3,int y3)
   {
      /*counting slope of each points*/
      AB=(y2-y1)/(x2-x1);
      BC=(y3-y2)/(x3-x2);
      AC=(y1-y3)/(x1-x3);
      /*condition for collinear*/
      if(AB==BC&&AB==AC&&BC==AC)
      {
        return true;
      }
      else
      {
        return false;
      }
   }
   /*method for finding collinear using area method*/
   public static boolean checkCollinearUsingArea(int x1,int y1,int x2,int y2,int x3,int y3)
   {
     area=(1/2)*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2));
     //condition
     if(area==0)
     {
       return true;
     }
     else
     {
       return false;
     }
   }
}
