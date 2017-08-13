
 /****************************************
   program;finding second largest and second smalleat
           from unsorted array
   Authur: Dharmendra mourya
   Version:1.0
   Date:10/08/17
  ******************************************/
     
package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class SecondLargestSmallestElement 
{

    public static void main(String[] args) 
    {
        int i,secondLargest,largest,secondSmallest,smallest,arraySize;
        //Scannner of array input
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array:");
        arraySize=in.nextInt();
        //create array of user defined size
        int array[]=new int[arraySize];
        //taking values in array
        for(i=0;i<arraySize;i++)
        {
            System.out.println("Enter value for position:"+(i+1));
            array[i]=in.nextInt();
        }
 /****************************************
    Second largest element code starts here
  ******************************************/
        largest=array[0];
        int x=0;
        //this for loop is for finding largest value
        for(i=1;i<arraySize;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
                //x count position of largest element
                x=i;
              
            }
         }
         //if first element is greatest
         if(x==0)
         { 
           /*now array is set to 1st position
           as our previous element is largest*/
           secondLargest=array[1];
           for(i=2;i<arraySize;i++)
           {
             if(array[i]>secondLargest)
             {
                secondLargest=array[i];
              
             }
             else
             {
                continue;
             }
           }
          //printing second largest value
         System.out.println(secondLargest);
         }
         //when x!=0
         else
         {
         /*This for loop is for second largest loop
         if our x is not zero */
         secondLargest=array[0];
         for(i=1;i<arraySize;i++)
         {
            if(array[i]>secondLargest && x!=i)
            {
                secondLargest=array[i];
              
            }
            else
            {
                continue;
            }
         }
         //printing second largest element
         System.out.println(secondLargest);
         }
  /****************************************
    Second largest element code ends here
  ******************************************/
      
  /****************************************
    Second Smallest element code starts here
  ******************************************/
        smallest=array[0];
         x=0;
        //this for loop is for finding smallest value
        for(i=1;i<arraySize;i++)
        {
            if(array[i]<smallest)
            {
                smallest=array[i];
                //x count position of smallest element
                x=i;
              
            }
         }
         //if first element is smallest
         if(x==0)
         { 
           /*now array is set to 1st position
           as our previous element is smallest*/
           secondSmallest=array[1];
           for(i=2;i<arraySize;i++)
           {
             if(array[i]<secondSmallest)
             {
                secondSmallest=array[i];
              
             }
             else
             {
                continue;
             }
           }
          //printing second smallest value
         System.out.println(secondSmallest);
         }
         //when x!=0
         else
         {
         /*This for loop is for second smallest
         if our x is not zero */
         secondSmallest=array[0];
         for(i=1;i<arraySize;i++)
         {
            if(array[i]<secondSmallest && x!=i)
            {
                secondSmallest=array[i];
              
            }
            else
            {
                continue;
            }
         }
         //printing second smallest element
         System.out.println(secondSmallest);
         }
  /****************************************
    Second Smallest element code ends here
  ******************************************/
         
    }
}
