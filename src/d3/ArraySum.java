package d3;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[]args) {
	int a[]	=new int[5];
	int sum=0;
	Scanner r=new Scanner(System.in);
	System.out.println("Enter elements in array");
	for(int i=0;i<a.length;i++)
	{
    a[i]=r.nextInt();
	}
System.out.println("Array Elements");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+"");
	sum=a[i]+sum;
}
System.out.println("Addition of array elements"+sum);
	
	
	
}
	
}
