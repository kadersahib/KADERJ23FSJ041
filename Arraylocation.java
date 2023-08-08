package closelabbook;
import java.util.ArrayList;

public class Arraylocation {
	
	
	
	public static int FindIndex(int[] arr,int t) {
		
		ArrayList<Integer> clist = new ArrayList<>();
		
		for(int i : arr)
			clist.add(i);
		
		return clist.indexOf(t);
		
	}
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The Index of position 4 is..."+FindIndex(array,4));
		System.out.println("The Index of position 6 is..."+FindIndex(array,10));
		
	}
}
