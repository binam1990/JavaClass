package d2;
import java.util.Scanner;
public class DisplayPattern {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number of terms: ");
    int n=input.nextInt();
    int s=0;
    for(int i=1; i<=n; i++) {
    	s=s*10+i;
    	System.out.println(s + " ");
    }

	}

}
