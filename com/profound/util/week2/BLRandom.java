/*******************************
  Program:Random Number generation with user defined library
  Authur:Dharmendra Mourya
  Date:19/08/17
 *******************************/
package com.profound;

/*user define library*/
import com.bridgelabz.lib.blLib;

public class BLRandom {

  static double[] a=new double[] {1,5,7,9,0,55,3};
  static double[] probabilities=new double[] {0.9,0.2,1.2,0.8};
  public static void main(String[] args) 
  { 
    //setting seed
    blLib.setSeed(System.currentTimeMillis());
    //bernauli 
    System.out.println("Bernoulli:"+blLib.bernoulli(0.6));
    //uniform 
    System.out.println("Uniform:"+blLib.uniform(5));
    //uniform with two argument of type double
    System.out.println("Uniform Argument:"+blLib.uniform(15.8,16.7));
    /*Gaussian here we pass mu and sigma*/
    System.out.println("Gaussian:"+blLib.gaussian(55.8,88.9));
    /*shuffle a array*/
    System.out.println("Array shuffle:"+blLib.shuffle(a));
    /*discrete*/
    System.out.println("Discrete:"+blLib.discrete(probabilities));
  }
}

