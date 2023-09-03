package closelabbook;
import java.util.Arrays;
import java.util.Collections;

public class orders {
	public static void main(String[] args) {
		
		System.out.println(" values of Ascending order");
		int arr [] = {10,7,4,3,5,2,8,9,1};
		
		Arrays.sort(arr);
		
		for(int values:arr) {
			System.out.println(values);
		}
		
		System.out.println("values of Descending order");
		
		
		Integer arr1[]= {10,7,4,3,5,2,8,9,1};
		
		Arrays.sort(arr1,Collections.reverseOrder());
		
		for (int values1:arr1) {
			System.out.println(values1);
		}
	}
}
