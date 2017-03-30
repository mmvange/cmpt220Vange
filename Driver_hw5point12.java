/*
Mary Vange, CMPT 220, Lab 3

*/

import java.util.Scanner;

public class Driver_hw5point12 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    int n = 0;
    int nSquare = n * n; 

    while(nSquare<12000){ 
      n++; 
      nSquared = n * n; 
    }
    
    
    System.out.println("The smallest integer n, which n squared is greater 12,000 is " + n); 
    
  }
}
