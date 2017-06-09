/** 
File: Driver_hw9point1.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 6
Version: 1.6

**/

public class Driver_hw9point1{
  public static void main(String[] args){
    
    Rectangle r1 = new Rectangle(4.0, 40.0); //Rectangle 1, declare new Rectangle with width 4.0 and height 40.0
    
    Rectangle r2 = new Rectangle(3.5, 35.9); //Rectangle 2, declare new Rectangle with width 3.5 and height 35.9 
    
    System.out.print("Rectangle 1: "); //print width, height, area, and perimeter of Rectangle 1 
    System.out.println("Width: " + r1.w);
    System.out.println("Height: " + r1.h);
    System.out.println("Area: " + r1.getArea() );
    System.out.println("Perimeter: " + r1.getPerimeter() );
    
    System.out.println("  "); //style
    
    System.out.print("Rectangle 2: "); //print width, height, area, and perimeter of Rectangle 2 
    System.out.println("Width: " + r2.w);
    System.out.println("Height: " + r2.h);
    System.out.println("Area: " + r2.getArea() );
    System.out.println("Perimeter: " + r2.getPerimeter() );
    
    
  }
}