/*
Mary Vange, CMPT 220, Lab 4
celsius to fahrenheit table 
*/

import java.util.Scanner;

public class Driver_hw6point8 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
   
 
    System.out.println("Celsius      Fahrenheit    |    Fahrenheit      Celsius\n" + "_________________________________________________________________");
    
    for (double celsius = 40.0, fahrenheit = 120.0;celsius >= 31.0;celsius--,fahrenheit -= 10) {
    
    double f;
    double c;

    f=celsiusToFahrenheit(celsius);
    c=fahrenheitToCelsius(fahrenheit);
    
  
    System.out.printf("%7.2f   %9.2f   %16.2f   %12.2f \n", celsius, f, fahrenheit, c);
    //System.out.printf(celsius + "      " + f + "    |    " + fahrenheit + "      " + c);
    }
   
   
  }
  
  /** Convert from Celsius to Fahreinheit **/
  public static double celsiusToFahrenheit(double celsius){
    
    return (9.0/5)*celsius+32;
    
    
    
    
  }
  
  
  
  
    
    
  /** Convert F to C **/
  public static double fahrenheitToCelsius(double fahrenheit){
   
   return (5.0/9)*(fahrenheit-32);
    
    
    
    
  }
  
  
}


