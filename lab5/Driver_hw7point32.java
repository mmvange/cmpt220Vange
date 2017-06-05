/** 
File: Driver_hw7point32.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 5
Version: 1.7

This code solves the following problem:
(Partition of a list) Write the following method that partitions the list
using the first element, called a pivot.

 public static int partition(int[] list)
 
After the partition, the elements in the list are rearranged so that all the elements before
the pivot are less than or equal to the pivot and the elements after the pivot are greater than the pivot.
The method returns the index where the pivot is located in the new list. For example, suppose the
list is {5, 2, 9, 3, 6, 8}. After the partition, the list becomes {3, 2, 5, 9, 6, 8}.
Implement the method in a way that takes at most list.length comparisons.
Write a test program that prompts the user to enter a list and displays the list after the partition.
Here is a sample run. Note that the first number in the input indicates the number of
the elements in the list. This number is not part of the list.

**/


import java.util.Scanner;

public class Driver_hw7point32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the list: ");
    
    int[] list = new int[input.nextInt()]; //array to be partitioned
    
    for(int i = 0; i < list.length; i++){
      list[i] = input.nextInt(); //assign inputs to array
      
    }
    
    partition(list);
    
    System.out.println("Patitioned list: ");
    
    for(int i = 0; i < list.length; i++){
      System.out.print(list[i] + " "); //print partitioned list
      
    }


  }
  
  public static int partition(int[] list) {
    int partitionIndex = list[0]; //set partition to first element in list array
    int listIndex = 0; //set list location index to 0
    int high = list.length - 1; //set high variable to end of list
 
    while(listIndex < high) {  //iterate through original list 
      if (partitionIndex > list[listIndex + 1]){ //if partitionIndex is larger than the list item then swap the partitionIndex and the item 
        list[listIndex] = list[listIndex + 1];
        list[listIndex + 1] = partitionIndex;
        listIndex++;
        
      }
      
      else { //if not, move item to end of list
        int placeHolder = list[high];
        list[high] = list[listIndex + 1];
        list[listIndex + 1] = placeHolder;
        high--;      
        
      }
    }
    return listIndex;
  }
}