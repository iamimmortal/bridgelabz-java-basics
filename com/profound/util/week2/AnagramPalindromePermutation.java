/****************************************
   program:Anagram Palindrome and permutation of string checking
           
   Authur: Dharmendra mourya
   Version:1.0
   Date:16/08/17
  ******************************************/
package com.profound;

import java.util.Scanner;
import java.lang.String;
import java.lang.Math;

public class AnagramPalindromePermutation 
{
  
  /*variable to store strings for anagram*/
   static String word1,word2;
   //converting string to char array
   static char[] string1,string2;
  /*variable store name to check for palindrome*/
   static String name;
   /*string to char array*/
   static char[] nameToChar;
  /*2 arrays count position of letters for anagram*/
   static int[] array1,array2;
   /*variable to store string entered by user to finds its permutation*/
   static String stringPermute;
   /*temp.string variable forcounting permutation*/
   static int fact;
  /*variable to store length of string entered by user to find permutation*/
   static int length;
  /*variable to store user option for switch case*/
   static int option;
  /*variable for controlling loop*/
   static int i;
   
  public static void main(String[] args) 
  {   
     /*making object of scanner class*/
       Scanner in=new Scanner(System.in);
     /*making object of current class*/
       AnagramPalindromePermutation app=new AnagramPalindromePermutation();
       
     /*Menu option*/
      System.out.println("1:Check for anagram:");
      System.out.println("2:Check for palindrome:");
      System.out.println("3:Permutation using iterative & recursive method:");
      System.out.println("Enter your option");
      option=in.nextInt();
     switch(option)
     {
       case 1:
       {
         /*init*/
          array1=new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
          array2=new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
          System.out.println("Enter your 1st string:");
          word1=in.next();
          System.out.println("Enter your 2nd string:");
          word2=in.next();
          System.out.println("Strings are anagram:"+app.anagram(word1,word2,word1.length()));
          break;
       }
       
       case 2:
       {
         System.out.println("Enter your string to check for palindrome:");
         name=in.next();
         System.out.println("The string is palindrome:"+app.palindrome(name,name.length()));
         break;
       }
       
       case 3:
       { 
         stringPermute="abcd";
         StringBuffer strBuf = new StringBuffer(stringPermute);
         permutation(strBuf,stringPermute.length());
         break;
       }
     }
  }
  
  //method for checking anagram
  public static boolean anagram(String word1,String word2,int size)
  {
     /*string to char*/
      string1=word1.toCharArray();
      string2=word2.toCharArray();
     /*for string 1*/
     //second string initials to array 1
     for(i=0;i<size;i++)
     {
        array1[string1[i]-97]++;
     }
     /*for string 2*/
     //second string initials to array 2
     for(i=0;i<size;i++)
     {
        array2[string2[i]-97]++;
     }
     //check both array
     for(i=0;i<26;i++)
     {
       if(array1[i]!=array2[i])
       {
         return false;
       }
     }
     return true;
  }
  //method for checking palindrme
  public static boolean palindrome(String name,int size)
  {
    //temp variable j for backward counting
     int j;
     //string to char
     nameToChar=name.toCharArray();
    for(i=0,j=size-1;i<=size/2;i++,j--)
    {
        if(nameToChar[i]!=nameToChar[j])
        {
           
           return false;
        }
    }
    return true;
  }
  //method finding permutations
  public static void permutation(StringBuffer stringPermute,int index)
  {
     if(index <= 0) 
     System.out.println(stringPermute); 
     else 
     { 
       //recursively solve this by placing all other chars at current first pos 
       permutation(stringPermute, index-1); 
       int currPos = stringPermute.length()-index; 
       for (int i = currPos+1; i < stringPermute.length();i++) 
       {
         //start swapping all other chars with current first char 
         swap(stringPermute,currPos, i); 
         permutation(stringPermute, index-1); 
         swap(stringPermute,i, currPos);
         //restore back my string buffer 
       }
   }
  }
  /*method for swapping to value*/
   public static void swap(StringBuffer s,int a,int b)
   {
     char temp=s.charAt(a);
     s.setCharAt(a,s.charAt(b));
     s.setCharAt(b,temp);
   }
}
