import java.util.Scanner;

public class Driver_hw4point1 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
	  System.out.println("Enter the radius of the pentagon");
	  double radiusLength = input.nextDouble();
	  
	  
	  double sideLength = input.nextDouble();
	  double areaPentagon = input.nextDouble();
	  
	  sideLength = (2*radiusLength)*(Math.sin(Math.PI/5));
	  areaPentagon = (5*(sideLength*sideLength))/(4*Math.tan(Math.PI/5));
	  
	  //answer
	  System.out.println("The area of the pentagon is: " + areaPentagon);
  }
}