package d1;

public class AreaOftraingle {

	public static void main(String[] args) {
		double a=4;
		double b=6;
		double c=8;
		double s=(a+b+c)/2;
		double Area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle:"+Area);
				
	}

}
