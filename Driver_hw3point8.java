import java.util.Scanner;

public class Driver_hw3point8 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
	  System.out.println("Enter the first integer");
	  double firstInteger = input.nextDouble();
	  System.out.println("Enter the second integer");
	  double secondInteger = input.nextDouble();
 	  System.out.println("Enter the third integer");
	  double thirdInteger = input.nextDouble();
	  
	  if(firstInteger> (secondInteger || thirdInteger)){
		  System.out.println(firstInteger + ",");
		  if(secondInteger>thirdInteger){
			  System.out.print(secondInteger + "," + thirdInteger);
		  }
		  else if(thirdInteger>secondInteger){
			  System.out.print(thirdInteger + "," + secondInteger);
		  }
	  }
	  
	  else if(secondInteger> (firstInteger || thirdInteger)){
		  System.out.println(secondInteger + ",");
		  if(firstInteger>thirdInteger){
			  System.out.print(firstInteger + "," + thirdInteger);
		  }
		  else if(thirdInteger>firstInteger){
			  System.out.print(thirdInteger + "," + firstInteger);
		  }
	  }
	  
	  else if(thirdInteger> (firstInteger || secondInteger)){
		  System.out.println(thirdInteger + ",");
		  if(secondInteger>firstInteger){
			  System.out.print(secondInteger + "," + firstInteger);
		  }
		  else if(firstInteger>secondInteger){
			  System.out.print(firstInteger + "," + secondInteger);
		  }
	  }
	  
 }
}