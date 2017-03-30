/*
Mary Vange, CMPT 220, Lab 3
*/

import java.util.Scanner;

public class Driver_hw5point13 {
  public static void main(String[] args) {
    
    int n = 0;
    int nCube = n * n * n; 

    while(nCube<12000) { 
    
      n++; 
      nCube = n * n * n; 
    }
    
    
    System.out.println("The smallest integer n, which n squared is greater 12,000 is " + n); 
    
    
    
  }
}


