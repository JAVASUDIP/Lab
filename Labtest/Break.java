package hellojavaop;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner in = new Scanner(System.in);
		        System.out.print("Input six non-negative digits: ");
		        int input = in.nextInt();
		        int a1 = input / 100000 % 10;
		        int a2 = input / 10000 % 10;
		        int a3 = input / 1000 % 10;
		        int a4 = input / 100 % 10;
		        int a5 = input / 10 % 10;
		        int a6 = input % 10;
		      System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6);

		    
		

	}

}
