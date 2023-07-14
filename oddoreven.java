package basiclabbook;
import java.util.Scanner;
public class oddoreven {
	public static void main(String[] args) {
		int num;
		System.out.println("please enter your number");
		
		Scanner scan = new Scanner(System.in);
		
		 num = scan.nextInt();
		
		if (num % 2==0) {
			System.out.println("Enter number is even number");
		}
		else 
		{
			System.out.println("Enter number is odd number");
		}
		
	}
}
