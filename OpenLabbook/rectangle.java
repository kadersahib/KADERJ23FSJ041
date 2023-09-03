package basiclabbook;
import java.util.Scanner;
public class rectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//area = lenght * width
		
		System.out.println("Enter the length of the rectangle");
		double lenght = scan.nextDouble();
		
		System.out.println("Enter the widht of the rectangle");
		double width = scan.nextDouble();
		
		double area = lenght * width;
		System.out.println("Area of Rectangle is"+area);
		
	}
}
