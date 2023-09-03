package basiclabbook;
import java.util.Scanner;
public class printnumber {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("enter a number");
		
		int num = reader.nextInt();
		
		System.out.println("Your Entered"+num);
	}
}
