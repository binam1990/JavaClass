package d2;
import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc1.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc1.nextInt();
		
		System.out.println("Enter the third number");
		int num3=sc1.nextInt();
		
		if(num1>num2 & num1>num3)
			System.out.println("first number is the largest");
		else if(num2>num3 & num2>num1)
			System.out.println("Second number is the largest");
		else
			System.out.println("Third number is the largest");

	}

}
