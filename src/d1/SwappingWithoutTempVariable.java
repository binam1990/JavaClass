package d1;

public class SwappingWithoutTempVariable {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("value of a before swapping" + a);
		System.out.println("value of b before swaping" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of a after swapping" + a);
		System.out.println("value of b after swapping" + b);

	}

}
