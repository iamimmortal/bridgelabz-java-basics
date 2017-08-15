/****************************************
   program:based on wind velocity count windchill
   Authur: Dharmendra mourya
   Version:1.0
   Date:11/08/17
  ******************************************/
packagepackage com.profound.util;

//Math class for inclusion of math built in functions
import java.lang.Math;
import java.util.Scanner;

public class WindChill 
{
       //variables store temperature,wind velocity by user
       static float tempreture,velocity;
       //Temp variable
       static float temp;
    public static void main(String[] args) 
    {  
        //scanner class object 
        Scanner in=new Scanner(System.in);
        //taking value of tempreture
        System.out.println("Enter tempreture in fareinheit:");
        tempreture=in.nextFloat();
        //taking value of velocity
        System.out.println("Enter velocity in miles:");
        velocity=in.nextFloat();
        //store pow of velocity
        temp=(float)Math.pow(velocity,0.16);
        //variable to store wind chil
        double windChill=(float)(35.74)+(0.6215*tempreture)+(0.4275*tempreture-35.75)*temp;
        //display result
        System.out.println("Windchill:"+windChill);
    }
}
