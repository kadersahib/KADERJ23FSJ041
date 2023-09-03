package basiclabbook;

public class largestnum {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		
		if (a>=b && a>=c) 
				System.out.println("A is greater than b and c");
		
		else if (b>=a && b>=c)
			System.out.println("B is greater than a and c");
		else 
			System.out.println("C is greater than a and b");
			
	}
}
