package basiclabbook;
import java.util.Scanner;
public class multitwonum {
	public static void main(String[] args) {
		Scanner multi = new Scanner(System.in);
		
		System.out.println("Enter value of i");
		int i = multi.nextInt();
		
		System.out.println("Enter value of  j");
		int j = multi.nextInt();
		
		int mul = i*j;
		System.out.println("the multiplication of i and j is.."+mul);
	}
}
