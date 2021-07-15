package d1;

public class QuadraticEquation {

	public static void main(String[] args) {
		double a = 1;
		double b = 5;
		double c = 6;

		Double x = ((-b + Math.sqrt(b * b - 4 * a * c) / 2 * a));
		Double x1 = ((-b - Math.sqrt(b * b - 4 * a * c) / 2 * a));

		System.out.println("Quartic Equation value is" + x);
		System.out.println("Quartic Equation value is" + x1);

	}

}
