import java.util.Scanner;

public class Driver_lab1CoursePercentage {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
	System.out.println("Enter your grades in percentages below.");
	
	System.out.println("Midterm Exam: ");
	double midtermExam = input.nextDouble();
	System.out.println("Final Exam: ");
	double finalExam = input.nextDouble();
	System.out.println("Projects: ");
	double projectsGrade = input.nextDouble();
	System.out.println("Homework and Labs: ");
	double homeworkAndLabs = input.nextDouble();
	
	double totalGrade = (midtermExam+finalExam+projectsGrade+homeworkAndLabs)/4.0;

	//display result
	System.out.println("Your total grade is: " + totalGrade);
 }
}