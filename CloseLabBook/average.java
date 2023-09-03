package closelabbook;
import java.util.Scanner;
public class average {
	public static void main(String[] args) {
		
		float num =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int n = sc.nextInt();
		
		float arr[] = new float[n];
		
		System.out.println("Enter array element"+n);
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
			num  = num+arr[i];
			
		}
		float average = num/n;
        System.out.println("Average of number is : "+average);
		
	}
	
}
