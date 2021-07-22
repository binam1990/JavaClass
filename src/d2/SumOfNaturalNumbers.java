package d2;
import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("sum to nth number");
	int n=input.nextInt();
	int sum=0;
	for(int i=1; i<=n; i++) {
		System.out.println("sum to nth number"+sum);
		sum=sum+i;
		
		
	}

	}

}
