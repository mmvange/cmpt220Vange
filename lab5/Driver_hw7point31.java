/** 
File: Driver_hw7point31.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 5
Version: 1.4

This code solves the following problem:

(Merge two sorted lists) Write the following method that merges two sorted 
lists into a new sorted list.                    
public static int[] merge(int[] list1, int[] list2)

Implement the method in a way that takes at most list1.length + list2.
length comparisons. Write a test program that prompts the user to enter two
sorted lists and displays the merged list. Here is a sample run. Note that the
first number in the input indicates the number of the elements in the list.
This number is not part of the list.   
**/

import java.util.Scanner;

public class Driver_hw7point31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter List 1: "); //ask user to input first list
    int[] list1 = new int[input.nextInt()]; 
    
    for(int i = 0; i < list1.length; i++){ //assign inputs to array of list1
      list1[i] = input.nextInt();
      
    }
    
    System.out.println(); //style
    
    System.out.print("Enter List 2: "); //ask user to input second list
    int[] list2 = new int[input.nextInt()]; 
    
    for(int i = 0; i < list2.length; i++){ //assign inputs to array of list2
      list2[i] = input.nextInt();
      
    }
    
    System.out.println();//style
    
    int[] mergeList = merge(list1, list2); //merge lists
    System.out.print("Merged list: "); //print merged list
    
    for(int i = 0; i < mergeList.length; i++){
      System.out.print(mergeList[i] + " ");
      
    }
   
    System.out.println(); //style
    
  }
    
  public static int[] merge(int[] list1, int[] list2){
    int[] mergeList = new int[list1.length + list2.length]; //declare mergeList of the size of list1 + list2   
      
    for(int i = 0; i < list1.length; i ++){ //add list1 variables to mergeList
      mergeList[i] = list1[i]; 
       
    } 
      
    for(int i = 0, j = list1.length; i < list2.length; i++, j++) { //add list2 variables to mergeList
      mergeList[j] = list2[i]; 
       
    }
      
    sort(mergeList); //sort variables in mergeList
      
    return mergeList;
  }
    
  public static void sort(int[] mergeList) { //sorts the merged list
    for(int i = 0; i < mergeList.length - 1; i++) { //iterate through mergeList 
      int min = mergeList[i];
      int minIndex = i;
       

      for(int j = i + 1; j < mergeList.length; j++) { //swap current list item with smaller value 
        if(mergeList[j] < min) { 
          min = mergeList[j]; 
          minIndex = j; 
          
        }					
      }
  
     
      if(minIndex != i) { //swap original list with sorted list
        mergeList[minIndex] = mergeList[i];
        mergeList[i] = min;
        
      }
    }
  }
}