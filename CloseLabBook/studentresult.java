package closelabbook;
import java.util.Arrays;
import java.util.Scanner;
public class studentresult {
	public static void main(String[] args) {
		Scanner sub = new Scanner(System.in);
		int n;
		
		System.out.println("Enter The Number of Subject");
		
		n= sub.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the Subject Marks");
		
		for (int i=0;i<n;i++) {
			arr[i]=sub.nextInt();
		}
		int total=0;
		
		for(int i=0;i<n;i++) {
			
			total = total+arr[i];
			}
		
		System.out.println("Total marks subject is...."+total);
		
		float percentage;
		percentage=(total/(float)n);
		System.out.println("average marks of student is.."+percentage);
		
		}
	
}
