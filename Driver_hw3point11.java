import java.util.Scanner;

public class Driver_hw3point11 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
	  System.out.println("Enter a month, 1 through 12");
	  int monthNumber = input.nextInt();
	  System.out.println("Enter a year");
	  int theYear = input.nextInt();
	  
	 switch(theYear % 12){
		case 0: System.out.println("January has 31 days"); break;
		case 1: System.out.println("February has 28 days"); break;
		case 2: System.out.println("March has 31 days"); break;
		case 3: System.out.println("April has 30 days"); break;
		case 4: System.out.println("May has 31 days"); break;
		case 5: System.out.println("June has 30 days"); break;
		case 6: System.out.println("July has 31 days"); break;
		case 7: System.out.println("August has 31 days"); break;
		case 8: System.out.println("September has 30 days"); break;
		case 9: System.out.println("October has 31 days"); break;
		case 10: System.out.println("November has 30 days"); break;
		case 11: System.out.println("December has 31 days"); 
	 }



	//old code with if/else
	/*	
	if(monthNumber== 1){
		System.out.println("January has 31 days");
	}
	else if(monthNumber==2){
		
	 boolean isLeapYear = (theYear % 400 == 0 || theYear % 4 == 0);

      if (isLeapYear == true){
       System.out.print("February has 29 days");
      } 
	  else if (isLeapYear == false){
	   System.out.print("February has 28 days");
	  } 
	  
	}
	
	
	else if(monthNumber==3){
		System.out.println("March has 31 days");
	}
	else if(monthNumber==4){
		System.out.println("April has 30 days");
	}
	else if(monthNumber==5){
		System.out.println("May has 31 days");
	}
	else if(monthNumber==6){
		System.out.println("June has 30 days");
	}
	else if(monthNumber==7){
		System.out.println("July has 31 days");
	}
	else if(monthNumber==8){
		System.out.println("August has 31 days");
	}
	else if(monthNumber==9){
		System.out.println("September has 30 days");
	}
	else if(monthNumber==10){
		System.out.println("October has 31 days");
	}
	else if(monthNumber==11){
		System.out.println("November has 30 days");
	}
	else if(monthNumber==12){
		System.out.println("December has 31 days");
	}
	else{
		System.out.print("Try again");
	}
	
	*/
	  
  }
}