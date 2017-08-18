/****************************************
   program:To find harmonic number,sin series
           cos series,decimal to binary.
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:16/08/17
  ******************************************/
package com.profound;

/*importing scanner class for taking user input*/
  import java.util.Scanner;
/*importing math class to include buitin math functions*/
  import java.lang.Math;
  
public class HarmonicSinCosBinary 
{
    /*Variable to store harmonic number from user*/
    static int harmonicNumber;
    /*following variable store angle taken from user
       and range of series*/
    static double sinAngle;
    static int sinSeriesRange;
    /*following variable store angle taken
       from user and range of series*/
    static double cosAngle;
    static int cosSeriesRange;
    /*variable store decimal number from user*/
    static int decimalNumber;
    /*Variable to store user option for switch case*/
    static int userOption;
    
  public static void main(String[] args) 
  {
        Scanner in=new Scanner(System.in);
        System.out.println("1:Harmonic Number");
        System.out.println("2:Sin of angle");
        System.out.println("3:Cosine of angle");
        System.out.println("4:Binary Number");
        System.out.println("Enter your option:");
        //taking user option
        SeriesCalculation sc=new SeriesCalculation();
        userOption=in.nextInt();
        switch(userOption)
        {
          case 1:
          {
            System.out.println("You have chosen to find Harmonic series:");
            System.out.println("Enter range of harmonic series:");
            harmonicNumber=in.nextInt();
            System.out.println("The harmonic series:"+sc.harmonic(harmonicNumber));
            break;
          }
          
          case 2:
          {
            System.out.println("You have chosen to find sin series:");
            System.out.println("Enter range of sin series:");
            sinSeriesRange=in.nextInt();
            System.out.println("Enter angle:");
            sinAngle=in.nextInt();
            System.out.println("sin x:"+sc.sinSeries(sinAngle,sinSeriesRange));
            break;
          }
          
          case 3:
          {
            System.out.println("You have chosen to find cos series:");
            System.out.println("Enter range of cos series:");
            cosSeriesRange=in.nextInt();
            System.out.println("Enter angle:");
            cosAngle=in.nextInt();
            System.out.println("sin x:"+sc.cosSeries(cosAngle,cosSeriesRange));
            break;
          }
          
          case 4:
          {
            System.out.println("You have chosen to convert decimal to binary:");
            System.out.println("Enter decimal number:");
            decimalNumber=in.nextInt();
            sc.binarySeries(decimalNumber);
            break;
          }
          
          default:
          System.out.println("Invalid input");
        }
  }
  
}

class SeriesCalculation
{
   /*Result of harmonic number store in this variable*/
    double harmonicResult;
    /*variable to store result of sin series*/
    double sinAngleResult;
    /*variable to store result of cos series*/
    double cosAngleResult;
    /*variable to store sign + or -*/
    int sign=1;
    /*variable to store power*/
    int power=0;
    /*variable to store decimal number*/
    int decimalNumber;
    /*counter for array storing and counting*/
     int i;
     int temp;
    /*counter variable to count number of bits in array*/
    int arrayCounter;
    /*store result of factorial*/
    int fact;
    
  //method for harmonic series calculation
  public double harmonic(int harmonicNumber)
  {
    for(int i=1;i<=harmonicNumber;i++)
    {
      harmonicResult=1.0/i;
    }
    return harmonicResult;
  }
  //method for sin series calculation
  public double sinSeries(double sinAngle,int sinSeriesRange)
  {
    /*initializing power=1*/
      power=1;
      /*initializing sinAngleResult*/
      sinAngleResult=0.0;
      /*converting angle to be between -2PI to 2PI*/
       sinAngle=sinAngle%(2*Math.PI);
    for(int i=1;i<=sinSeriesRange;i++)
    {
      sinAngleResult+=sign*Math.pow(sinAngle,power)/factorial(power);
      //increasing power by 2 odd manner
      power+=2;
      //for alternate + or -
      sign=-sign;
    }
    return sinAngleResult;
  }
  
   //method for cos series calculation
  public double cosSeries(double cosAngle,int cosSeriesRange)
  {
    /*initializing power=1*/
      power=0;
      /*initializing sinAngleResult*/
         /*converting angle to be between -2PI to 2PI*/
       cosAngle=cosAngle%(2*Math.PI);
       cosAngleResult=1.0;
    for(int i=2;i<=cosSeriesRange;i++)
    {
      //for alternate + or -
      sign=-sign;
      cosAngleResult+=sign*Math.pow(cosAngle,power)/factorial(power);
      //increasing power by 2 odd manner
      power+=2;
    }
    return cosAngleResult;
  }
  
  //method for converting decimal to binary
  public void binarySeries(int decimalNumber)
  {
    /*declaring and initializing binary array*/
     int binary[]=new int[10];
     //initializing counters
     i=0;
     temp=0;
    while(decimalNumber>0)
    {
      binary[i]=decimalNumber%2;
      decimalNumber/=2;
      i++;
      temp++;
    }
    if(temp!=8)
    {
      while(temp<=7)
      {
        binary[temp]=0;
        temp++;
      }
    }
    System.out.println();
    //printing binary bits
    for(i=temp-1;i>=0;i--)
    {
      System.out.print(binary[i]);
    }
  }
  
  /*method for finding factorial*/
    int factorial(int power)
    {
      /*initializing fact to 1*/
       fact=1;
      if(power==0||power==1)
      {
        return 1;
      }
      else 
      {
        while(power>0)
        {
          fact=fact*power;
          power--;
        }
        return fact;
      }
    }
}

