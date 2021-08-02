package d2;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int originalNumber=input.nextInt();
		
		int reverseNumber=0;
		System.out.println("original number:"+originalNumber);
		while(originalNumber!=0) {
			reverseNumber=reverseNumber*10+originalNumber%10;
			originalNumber=originalNumber/10;
		}
			
			
			
			
		
System.out.println("Reverse number is:"+reverseNumber);
	}

}
