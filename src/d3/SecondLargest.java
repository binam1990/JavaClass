package d3;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		int n=input.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter arr number:");
			arr[i]=input.nextInt();
			int max1=arr[0];
			int max2=arr[1];
			for(int i1=2;i1<arr.length;i1++) {
				if(arr[i1]>max2)
				{
					max2=arr[i1];
				}
				if(max2>max1)
				{
					int temp=max1;
					max1=max2;
					System.out.println("find a second max:"+max2);
				}
			}
		}
	}

}
