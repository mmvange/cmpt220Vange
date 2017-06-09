/** 
File: Driver_hw9point13.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 6
Version: 1.3

**/

import java.util.Scanner;

public class Driver_hw9point13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number of rows and columns: "); // get rows and columns for 2d array
    int row = input.nextInt();
    int col = input.nextInt();
    
    double[][] array = new double[row][col];
    
    System.out.print("Enter array: ");
    
    for(int i = 0; i < array.length; i++){ //ask user to enter numbers for the array
      for(int j = 0; j < array[i].length; j++){
        array[i][j] = input.nextDouble();
        
      }
    }
    
    Location loc = Location.getLargest(array); //find location of largest element
    System.out.println("The largest element is: " + loc.maxValue + ", which is located at: " + loc.row + ", " + loc.column); //print largest element info 
    
  }
}


