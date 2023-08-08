package closelabbook;

public class dispaymatrix {
	
	public static void displaymatrix(int[][]matrix) {
		for(int []row: matrix) {
			for(int num : row) {
				System.out.print(num +"");
			}
				System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		 int [][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		 
		 displaymatrix(matrix);
		
	}
}