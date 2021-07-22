package d2;
import java.util.Scanner;
public class Fibbonacci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number to find fibbonacci:");
		int n=input.nextInt();
		int first=1;
		int second=1;
		System.out.println(first+"");
		for(int i=1; i<=n; i++) {
			System.out.println(second+"");
			int temp=first+second;
			first=second;
			second=temp;
			input.close();
		}

	}

}
