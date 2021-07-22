package d2;
import java.util.Scanner;
public class SidesOfTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double side1,side2,side3;
		System.out.println("enter side1");
		side1=input.nextDouble();
		System.out.println("enter side2");
		side2=input.nextDouble();
		System.out.println("enter side3");
		side3=input.nextDouble();
		if(side1+side2>side3)
			if(side2+side3>side1)
				if(side1+side3>side2)
					System.out.println("can be sides of triangle");
					
				
					
					

	}

}
