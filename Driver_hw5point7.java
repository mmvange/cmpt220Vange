/*
Mary Vange, CMPT 220, Lab 3
compute tuition with 5% increase
*/

import java.util.Scanner;

public class Driver_hw5point7 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    double tuit = 10000.00; //short for tuition 
    double sum = 0;
    int yr = 0;
    double intRate = 0.05;
    
    
    for(yr=1; yr<14; yr++){
      tuit = tuit * intRate; //possibly could have used 1.05 for tuition itself and also the 5% maybe fix later 
      double roundTuit =(Math.round(tuit*100.0)/100.0);
      
    if(yr==9){ 
      System.out.println("The tuition in 10 years will be $" + roundTuit); 
    }
    if(yr>9 && yr<14){ 
      sum += roundTuit; 
    }
    
    }
    
    System.out.println("The total tuition after 10 years is $" + sum);
  
  
  }
}


    