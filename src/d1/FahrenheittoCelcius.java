package d1;

public class FahrenheittoCelcius {

	public static void main(String[] args) {
		double C = 100;
		double F = C * (9F / 5) + 32;
		System.out.println("Celcius to fahrenheit:" + F);

		double F1 = 212;
		double C1 = ((F1 - 32) * 5) / 9;
		System.out.println("Fahrenheit to celcius: " + C1);
	}
}