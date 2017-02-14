import java.util.Scanner;

public class Driver_zodiac{
  public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.println("enter your birth year: ");
  	double birthYear = scan.nextDouble();
	double chineseZodiac = birthYear % 12;
	System.out.println(chineseZodiac);
  }
}