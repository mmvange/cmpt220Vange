import java.util.Scanner;

public class Driver_hw4point5 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
	  System.out.println("Enter the number of sides:");
	  double numOfSides = input.nextDouble();
	  System.out.println("Enter the side length:");
	  double sideLength = input.nextDouble();
	  
	  double totalArea = input.nextDouble();
	  
	  totalArea = (numOfSides *(sideLength*sideLength))/(4*(Math.tan(Math.PI/numOfSides)));
	  
	  System.out.println("The area is: " + totalArea);
	  
  }
}