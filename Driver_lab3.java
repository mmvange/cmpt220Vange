/*
Mary Vange, CMPT 220, Lab 3
Kattis distance problem 
*/

import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
   double x1;
   double x2;
   double y1;
   double y2;
   double p;
   
   while(true){
   x1=input.nextDouble();
     if(x1 == 0.0){
       break;
     }
     
   y1=input.nextDouble();
   x2=input.nextDouble();
   y2=input.nextDouble();
   p=input.nextDouble();
   
   //(|x1−x2|^p+|y1−y2|^p)^1/p
   
   double answer;
   
   
   answer= Math.pow(Math.pow(Math.abs(x1-x2),p) + Math.pow(Math.abs(y1-y2),p), 1/p);
   
   System.out.println(answer);
   
   }
   
   
  }
}
