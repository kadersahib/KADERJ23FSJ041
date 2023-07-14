package basiclabbook;
import java.util.Scanner;
public class square {
	public static void main(String[] args) {
		System.out.println("enter the side of square");
		Scanner scan = new Scanner (System.in);
		
		double side = scan.nextDouble();
		//area of square= side*side
		
		double area = side * side;
		
		System.out.println("area of square is."+area);
		
			
	}
}
