/** 
File: Driver_hw7point20.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 5
Version: 2.3

This code solves the following problem:
The selection-sort method repeatedly finds the smallest number in the   
current array and swaps it with the first. Rewrite this program by finding the
largest number and swapping it with the last. Write a test program that reads
in ten double numbers, invokes the method, and displays the sorted numbers. 

**/


import java.util.Scanner;

public class Driver_hw7point20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double[] arr = new double[10]; //declare a new array of numbers (arr)
    
    System.out.print("Enter 10 numbers"); //asking user to input
    System.out.println(); //to print a space for style purposes
    for( int i = 0; i < arr.length; i++){
      arr[i] = input. nextDouble();
      //for loop that enters numbers (user gave) into array
    }
    
    selectionSort(arr);
    System.out.print("Sorted array: ");
    for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " "); //printing sorted array
    
    }
    System.out.println();//style
   
  }
  
  public static void selectionSort(double[] arr) { //sorting items from minimum to maximum
    for (int i = arr.length-1; i > 0; i--){ //assigns currentMax to i and i to the index of array
      double currentMax = arr[i];
      int maxIndex = i;
      
      for(int j = 0; j < i; j++){ //compares numbers to i to see what is smaller
        if(currentMax < arr[j]) { // if i < j then swap the numbers 
          currentMax = arr[j]; //swap
          maxIndex = j;
          
        }
      }
      
      if(maxIndex != i){ //swap original list with sorted list 
        arr[maxIndex] = arr[i];
        arr[i] = currentMax;
        
      }
    }
  }
  

}
