package closelabbook;
import java.util.Scanner;
public class twodarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the rows size");
		int rows = scan.nextInt();
		
		System.out.println("Enter the Column size");
		int col = scan.nextInt();
		
		int arr [][] = new int [rows][col];
		
		System.out.println("Enter The Values");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr [i][j]= scan.nextInt();
			}
		}
		
		for (int i=0;i<rows;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(arr[i][j]+"");
			}
				System.out.println();
		}
	}
}
