package d2;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number,remainder;
		System.out.println("enter an integer number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		
		remainder = number % 2;
		if( remainder==0)
			System.out.println(number+"is an even number");
		else
			System.out.println(number+"is an odd number");
				
	}

}
