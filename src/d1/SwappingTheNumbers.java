package d1;

import java.util.Scanner;

public class SwappingTheNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("before swapping a:");
		int a = input.nextInt();
		System.out.println("before swapping b:");
		int b = input.nextInt();
		System.out.println("value of a before swapping" + a);
		System.out.println("value of a before swapping" + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of a after swapping" + a);
		System.out.println("value of b after swapping" + b);

	}
}