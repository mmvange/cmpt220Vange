/*
Mary Vange, CMPT 220, Lab 1
*/

import java.util.Scanner;

public class Driver_hw2point6 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
	System.out.print("Enter an integer between 0 and 1000: ");
	double inputInteger = input.nextDouble();
	
	double firstNumber = inputInteger % 10;
    double remainderNum = inputInteger / 10;
	
    double secondNumber = remainderNum % 10;
    double remainderNum2 = remainderNum / 10;

    double thirdNumber = remainderNum2 % 10;
	
	double sum = firstNumber + secondNumber + thirdNumber;

    System.out.println("The sum is:" + sum);

  }
}