/*
Mary Vange, CMPT 220, Lab 1
*/

import java.util.Scanner;

public class Driver_hw2point5 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
	System.out.print("Enter the cost of your meal: ");
	double subtotalMeal = input.nextDouble();
	System.out.print("Enter the gratuity percentage: ");
	double gratuityPercentageInput = input.nextDouble();
	
	double gratuityPercentToDecimal = gratuityPercentageInput * 0.010;
	double gratuityInDollars = gratuityPercentToDecimal * subtotalMeal;
	
	double totalMealWithTip = subtotalMeal + gratuityInDollars;
	
	
  //display result
  System.out.println("Your total tip cost is: " + gratuityInDollars);
  System.out.println("Your total meal cost is: " + totalMealWithTip);
 
  }
}