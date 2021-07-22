package d2;
import java.util.Scanner;
public class SumAndProduct {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a first num:");
		int a=input.nextInt();
		System.out.println("enter a second num");
		int b=input.nextInt();
		System.out.println("enter a third num");
		int c=input.nextInt();
		int sum=a+b+c;
		int product=a*b*c;
		System.out.println("sum of given three numbers:"+sum);
		System.out.println("product of given three numbers:"+product);
		
		
		
	}

}
