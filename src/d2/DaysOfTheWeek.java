package d2;
import java.util.Scanner;
public class DaysOfTheWeek {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("days of week:");
	String week=input.next();
	
	switch(week) {
	case"-":
		System.out.println("sunday");
		break;
	case"+":
		System.out.println("monday");
		break;
	case"/":
		System.out.println("tuesday");
		break;
	case"*":
		System.out.println("wednesday");
		break;
	case"<":
		System.out.println("thursday");
		break;
	case"?":
		System.out.println("friday");
		break;
	case"%":
		System.out.println("saturday");
		break;
		default:
			System.out.println("does not exist:");
	
			
			
		
		
	}

	}

}
