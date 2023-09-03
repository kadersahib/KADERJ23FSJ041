package closelabbook;
import java.util.Scanner;
public class primeornot {
	public static void main(String[] args) {
		System.out.println("Please Enter Your Number");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		
		if(num/2==0) {
			System.out.println("It is not a prime number");
		}
		else {
			System.out.println("It is a prime number");
		}
	}
}
