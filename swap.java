package basiclabbook;

public class swap {
	public static void main(String[] args) {
		float first = 2.5f;
		float second = 3.5f;
		
		System.out.println("Before the swap ");
		System.out.println("first number"+first);
		System.out.println("second number"+second);
		
		
		float temp = first;
		first = second;
		second = temp;
		
		System.out.println("After the swap ");
		System.out.println("first number"+first);
		System.out.println("second number"+second);
	}
}
