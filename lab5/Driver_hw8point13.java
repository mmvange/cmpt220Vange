/** 
File: Driver_hw8point13.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 5
Version: 1.3

This code solves the following problem:
(Locate the largest element) Write the following method that returns the location of the largest element in a two-dimensional array.
public static int[] locateLargest(double[][] a)
The return value is a one-dimensional array that contains two elements. These two elements indicate the row and column indices of the 
largest element in the two-dimensional array. Write a test program that prompts the user to enter a two-dimensional array and displays 
the location of the largest element in the array.

**/




import java.util.Scanner;

public class Driver_hw8point13 {
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
    
    int[] location = getLargest(array); //find location of largest element
    
    System.out.print("The largest element is at location: " + location[0] + " , " + location[1] + " .");

    } 
    
    public static int[] getLargest(double[][] array) { //method to find largest element
      int[] location = new int[2];
      location[0] = 0;
      location[1] = 0;
      double maximum = 0; //temporary maximum for comparisons
      for(int i = 0; i < array.length; i++){ //going through all the rows and columns
        for(int j = 0; j < array[i].length; j++){
          if(array[i][j] > maximum){ //comparing each pair to temporary maximum
            location[0] = i;
            location[1] = j;
            maximum = array[i][j]; //set temporary maximum to the larger element
            
          }
        }
      }
      
      return location;
      
    } 
  }