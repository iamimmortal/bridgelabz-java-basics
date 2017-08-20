/*********************************
  Program:blLib,user defined library consiat of stdinput functios,
          stdoutput functions,stop watch function,random generator
          fuctions etc;
  
  Author: Dharmendra mourya
  Date  : 17/08/17
 *********************************/
package com.bridgelabz.lib;

/*library of random generator class and scanner and math class*/
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class blLib 
{
  /*object of Inbuilt random generator*/
   private static Random random;
  /*variable to store seed*/
   private static long seed;
  /*setting seed*/
   public static void setSeed(long s) 
   { 
     random = new Random(s); 
   }
  //method for uniform random generator for int single argument
   public static int uniform(int n) 
   {
     return random.nextInt(n);
   }
   //uniform method to get new double value from random class
   public static double uniform()
   {
     return random.nextDouble();
   }
  //method for uniform distribution of double two argument
   public static double uniform(double a, double b) 
   { 
      return a + uniform() * (b-a); 
   } 
   /*bernauli random generator method provide true or false 
     by checking passed input with uniform generator function*/
   public static boolean bernoulli(double p) 
   { 
      return uniform() < p; 
   } 
   //gaussian random generator method
   public static double gaussian() 
   { 
   // use the polar coordinates
     double r, x, y; 
     do 
     { 
       //x cordinates passed to uniform random generator 
       x = uniform(-1.0, 1.0); 
       //y cordinates passed to uniform random generator
       y = uniform(-1.0, 1.0); 
       //circle polar coordinates
       r = x*x + y*y; 
     } 
     while (r >= 1 || r == 0); 
     return x * Math.sqrt(-2 * Math.log(r) / r);
   } 
  /*calling gaussian random generator with passing two argument */
   public static double gaussian(double mu, double sigma) 
   { 
     return mu + sigma * gaussian();
   }
  /*Suffle the elements of array*/
   public static double[] shuffle(double[] a) 
   { 
     //this will validate parameter
      validateNotNull(a);
     //finding length of array
      int n = a.length; 
      for (int i = 0; i < n; i++) 
      { 
        int r = i + uniform(n-i); 
        // between i and n-1 
        double temp = a[i]; 
        a[i] = a[r]; 
        a[r] = temp; 
      } 
      return a;
    }
  /*random number generator using discrete distribution*/
  public static double discrete(double[] probabilities) 
  { 
    if (probabilities == null) 
    throw new IllegalArgumentException("argument array is null"); 
    //for error tolerencell
    double EPSILON = 1E-14; 
    double sum = 0.0; 
    for (int i = 0; i < probabilities.length; i++) 
    { 
      if (!(probabilities[i] >= 0.0)) 
      throw new IllegalArgumentException("array entry " + i + " must be nonnegative: " + probabilities[i]); 
      sum += probabilities[i]; 
    }
    return sum;
  }
   /*****************************
     function to validate null
     value
    *****************************/
  public static void validateNotNull(Object x) 
  { 
    if (x == null) 
    { 
      throw new IllegalArgumentException("argument is null"); 
    }
  }
  /******************************
    for standard output
   *******************************/
   // send output here 
  public static PrintWriter out; 
  // this is called before invoking any methods 
  static 
  {
      out = new PrintWriter(new OutputStreamWriter(System.out), true); 
  }
  //to print new line
  public static void println()
  {
    System.out.println();
  }
  //print string without new line
  public static void print(String s)
  {
    System.out.print(s);
  }
  //print string with new line
  public static void println(String s)
  {
    System.out.println(s);
  }
  //print multiple string
  public static void printf(String format,Object... args)
  {
    out.printf(format,args);
    out.flush();
  }
  /******************************
    for standard input
   *******************************/
   //scanner class object
  private static Scanner in;
  //if next input is empty return boolean
  public static boolean isEmpty() 
  { 
    return !in.hasNext();
  }
  //return boolean if has next line
  public static boolean hasNextLine() 
  { 
    return in.hasNextLine();
  }
  //read next line
  public static String readLine() 
  { 
    String line; 
    line = in.nextLine();
    return line; 
  } 
//take next input convert to int and return
  public static int readInt() 
  { 
    return in.nextInt(); 
  }
  /******************************
    for standard statistics
   *******************************/
   //max of array
  private static double mean,variance;
  public static double max(double[] a)
  {
     double temp=a[0];
     for(int i=0;i<a.length;i++)
     {
       if(temp<a[i])
       {
          temp=a[i];
       }
     }
     return temp;
  }
   //mix of array
  public static double min(double[] a)
  {
     double temp=a[0];
     for(int i=0;i<a.length;i++)
     {
       if(temp>a[i])
       {
          temp=a[i];
       }
     }
     return temp;
  }
  //mean of array
  public static double mean(double[] a)
  {
     for(int i=0;i<a.length;i++)
     {
        mean=mean+a[i];
     }
     return mean/a.length;
  }
  //variance
  public static double var(double[] a)
  {
     for(int i=0;i<a.length;i++)
     {
       variance=variance+Math.pow((a[i]-mean(a)),2);
     }
     return variance/a.length;
  }
  //std deviation
  public static double std(double[] a)
  {  
     return Math.sqrt(var(a));
  }
  
  /******************************
    Fuctions for stopwatch
   ******************************/
   //variable to store current time
   public static double start; 
   /*Initializes a new stopwatch in variable start*/ 
   public static double stopWatch() 
   { 
     start = System.currentTimeMillis(); 
     return start;
   } 
   /*return cpu time elapsed in seconds*/
   public static double elapsedTime(double old) 
   { 
     double now = System.currentTimeMillis(); 
     /*1000 is 1 second and start time is deducted with newly calculated time*/
     return (now - old) / 1000.0; 
   } 

}
