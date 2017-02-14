/*
Mary Vange, CMPT 220, Lab 1
*/

import java.util.Scanner;

public class Driver_hw2point1 {
  public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.print("Enter degree in Celsius: ");
  double degreeInCelsius = scan.nextDouble();
  double degreeInFarenheit = (9.0/5.0)* degreeInCelsius + 32;
  
  //display result
  System.out.println(degreeInCelsius + " Celsius is " + degreeInFarenheit + " Farenheit.");
  }
}