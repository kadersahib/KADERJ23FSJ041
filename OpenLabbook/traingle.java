package basiclabbook;
import java.util.Scanner;
public class traingle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter width of the traingle");
		double width = scan.nextDouble();
		
		System.out.println("Enter height of the traingle");
		double height = scan.nextDouble();
		
		double area = (width*height)/2;
		
		System.out.println("The area of traingle.."+area);
	}
}
