package hellojavaop;

// Writer a java program that two integers from the user and then print sum,different, product,average, distance.
import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number is -");
		
		int a = sc.nextInt();
		System.out.println("Enter your 2nd number is -");
		
		int b = sc.nextInt();
	
		//int d = a+b;
		//int different= a-b;
		//int product = a*b;
		//int average = (a+b)/2;		
		 int distance = a-b;
		//System.out.println("The different of the number is "+different);
		
		//System.out.println("The product of the number is "+product);
		//System.out.println("The average of the number is "+average);
		 System.out.println("The different of the number is "+distance);
		
		
		
		
	}

}
