/*
Mary Vange, CMPT 220, Lab 3
*/

import java.util.Scanner;

public class Driver_hw6point2 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter an integer");
    double s1 = input.nextInt();
    System.out.println(sumDigits(s1)); 
  }

  public static int sumDigits(double n2){
	String s1 = double.toString(n2); //idk what "class expected" error is here I looked it up and can't find solution 
    int sum = 0; 
	  
    for (int i=0; i < s1.length(); i++){
      
      String z3 =(s1.charAt(i) + ""); 
      sum += Integer.parseInt(z3);
  } 
    return sum;
  
  
  }
}

