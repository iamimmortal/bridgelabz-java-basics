/****************************************
   program:Month of year
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:17/08/17
  ******************************************/
package com.profound;

import java.lang.Math;
import java.util.Scanner;

public class PrintMonthOfYear
{

    /*variable store month,year from user*/
     static int dayInput,monthInput,yearInput;
     /*variable to store return value from user*/
     static int storeReturnValue;
     /*12 variable denote 12 months*/
     static int jan,feb,mar,apr,may,jun,july,aug,sep,oct,nov,dec;
     /*counter variable*/
     static int temp=0;
    public static void main(String[] args) 
    {
        
        Scanner in=new Scanner(System.in);
        //initializing day input to 1
        dayInput=1;
        System.out.println("Enter month:");
        //take month as input from user
        monthInput=in.nextInt();
        System.out.println("Enter year:");
        //take year as input from user
        yearInput=in.nextInt();
        /* Initializing each month*/
         jan=31;
         feb=28;
         mar=31;
         apr=30;
         may=31;
         jun=30;
         july=31;
         aug=31;
         sep=30;
         oct=31;
         nov=30;
         dec=31;
        //take return value from call function
        CalculateDayOfWeek cdw=new CalculateDayOfWeek();
        
        storeReturnValue=cdw.calculateDayOfWeek(dayInput,monthInput,yearInput);
        //codition 
        switch(monthInput)
        {
            case 1:
            {
            System.out.println("Jan,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            
            break;
            }
            
            case 2:
            {
            System.out.println("Feb,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 3:
            {
            System.out.println("Mar,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 4:
            {
            System.out.println("Apr,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 5:
            {
            System.out.println("May,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tS");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 6:
            {
            System.out.println("jun,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 7:
            {
            System.out.println("july,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 8:
            {
            System.out.println("Aug,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
             /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 9:
            {
            System.out.println("Sep,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 10:
            {
            System.out.println("Oct,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 11:
            {
            System.out.println("Nov,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
              /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
            
            case 12:
            {
            System.out.println("Dec,"+yearInput);
            System.out.println("S\t\tM\t\tT\t\tW\t\tT\t\tF\t\tST");
            /*if 1st day is sunday*/
            if(storeReturnValue==0)
            {   
                temp=0;
                System.out.print("1");
               for(int i=1;i<=jan;i++)
               { 
                  if(i<=9&&i!=1)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                   
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is monday*/
            else if(storeReturnValue==1)
            {   
                temp=1;
                System.out.print("\t\t1");
               for(int i=2;i<=jan;i++)
               { 
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                    //System.out.print("\t");
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            /*if 1st day is tuesday*/
            else if(storeReturnValue==2)
            {   
                 temp=3;
                 System.out.print("\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                   }
                   //this condition for seprating 9th and 10th
                   if(i==10)
                    {
                      System.out.print("\t");
                    }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*if 1st day is wednesday*/
             else if(storeReturnValue==3)
             {   
                 temp=4;
                 System.out.print("\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=jan;i++)
                 { 
                   /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                    if(i<=9)
                    {
                      System.out.print("\t");
                    }
                    if(temp>6)
                    {
                      temp=0;
                      System.out.println();
                    }
                   //this condition for seprating 9th and 10th
                    if(i==10)
                    {
                      System.out.print("\t");
                    }
                    System.out.print(i+"\t");
                    temp++;
                  }
              }
            /*if 1st day is thursday*/
              else if(storeReturnValue==4)
              {   
                  temp=5;
                  System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                 for(int i=2;i<=dec;i++)
                 { 
                    /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                     if(i<=9)
                     {
                       System.out.print("\t");
                     }
                     if(temp>6)
                     {
                       temp=0;
                       System.out.println();
                     }
                   //this condition for seprating 9th and 10th
                     if(i==10)
                     {
                       System.out.print("\t");
                     }
                    System.out.print(i+"\t");
                    temp++;
                 }
              }
            /*if 1st day is friday*/
              else if(storeReturnValue==5)
              {   
                 temp=6;
                 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
                for(int i=2;i<=jan;i++)
                { 
                   if(i<=9)
                   {
                     System.out.print("\t");
                   }
                   if(temp>6)
                   {
                     temp=0;
                     System.out.println();
                    //System.out.print("\t");
                   }
                   System.out.print(i+"\t");
                   temp++;
                }
             }
            /*If 1st day is saturday*/
            else
            {   
                temp=7;
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1\t");
               for(int i=2;i<=july;i++)
               { 
                  /*This condition print a tab between element upto 9 so that it will align with two digit number*/
                  if(i<=9)
                  {
                    System.out.print("\t");
                  }
                  if(temp>6)
                  {
                    temp=0;
                    System.out.println();
                  }
                  System.out.print(i+"\t");
                  temp++;
               }
            }
            break;
            }
        }
    }
}
//class for calculation
class CalculateDayOfWeek 
{    
     /*variable to store year calculation*/
     static int storeYear;
     /*variable to store leap year calculation*/
     static int storeLeapYear;
     /*variable to store month calculation*/
     static int storeMonth;
     /*variable to store day calculation*/
     static int storeDay;
     
    //function takes 3 argument to process
    int calculateDayOfWeek(int dayInput,int monthInput,int yearInput)
    {
        //calculate year
        storeYear=yearInput-(14-monthInput)/12;
        //calculate laep year
        storeLeapYear=storeYear+(storeYear/4)-(storeYear/100)+(storeYear/400);
        //calculate month
        storeMonth=monthInput+12*((14-monthInput)/12)-2;
        //calculate days
        storeDay=(dayInput+storeLeapYear+31*storeMonth/12)%7;
        //return day
        return storeDay;
    }
}




