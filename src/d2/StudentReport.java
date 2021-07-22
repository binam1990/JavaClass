package d2;
import java.util.Scanner;
public class StudentReport {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("enter number of students:");
	int numStudent=input.nextInt();
	
	int maxScore=0;
	String studentName="";
	
	for(int i=1;i<=numStudent; i++) {
		System.out.println("enter a name of student:");
		String name=input.next();
		System.out.println("enter score of student");
		int score=input.nextInt();
		if(score>maxScore) {
			maxScore=score;
			studentName=name;
			
			System.out.println("student name:"+studentName);
			System.out.println("maxscore:"+maxScore);
			
			input.close();
		}
	}
	

	}

}
