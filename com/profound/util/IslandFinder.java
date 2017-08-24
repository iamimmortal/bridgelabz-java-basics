/******************************
   Program:Island Finder where 0 is water and 
           1 is land and must be surrounded by 0; 
   Author:Dharmendra mourya
   Date:22/08/17 
*****************************/ 
 package com.dharmu; 
 
 import java.util.Scanner; 
 import java.lang.Math; 
 
 public class IslandFinder 
 { 
   static int row; 
   static int column; 
   static int[][] planet; 
   //controlling loop 
   static int i,j; 
   public static void main(String[] args) 
   { 
     //object of scanner class 
     Scanner in=new Scanner(System.in); 
     System.out.println("Enter number of row:"); 
     row=in.nextInt(); 
     System.out.println("Enter number of row:"); 
     column=in.nextInt(); 
     //instantiate planet array 
     planet=new int[row][column]; 
     //giving input to matrix 
     for(i=0;i<row;i++) 
     { 
       for(j=0;j<column;j++) 
       { 
         planet[i][j]=(int)Math.round(Math.random()); 
       }
      } 
      //printing matrix 
      for(i=0;i<row;i++) 
      { 
        for(j=0;j<column;j++) 
        { 
          System.out.print(planet[i][j]); 
        } 
          System.out.println(); 
      } 
       //logic for finding island
        for(i=1;i<row-1;i++) 
        { 
          for(j=1;j<column-1;j++) 
          { 
            if(planet[i][j]==1&&planet[i-1][j]==0
               &&planet[i][j+1]==0&&planet[i][j-1]==0
               &&planet[i+1][j]==0)
               {
                 System.out.println("Island found at:"+i+","+j);
               }
          } 
      } 
    } 
 }
