/*
Mary Vange, CMPT 220, Lab 3
count pos, count neg, display average
*/

import java.util.Scanner;

public class Driver_hw5point1 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    int pos = 0;
    int neg = 0;
    int total = 0;
    double average = 0.0;
    int inputtedVar;
    
    
    do{
    System.out.print("Enter an integer, the input ends if it is 0: ");
    inputtedVar = input.nextInt(); 
      total++; 
      sum += inputtedVar; 
      if(inputtedVar>0) {
        pos++; 
      }
      else if(inputtedVar<0){
        neg++; 
      }
    } 
    
    while(inputtedVar!=0); 
    
    double average = total/(neg+pos);
    
  
    System.out.println("The number of positives is " + pos);
    System.out.println("The number of negatives is " + neg);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
 }
}

