package closelabbook;
import java.util.Arrays;
public class resizearray {
	public static void main(String[] args) {
		int[] oldarray = {1,2,3,4,5,6,7,8,9,10,11,22};
		
		int[] newarray = new int[6];
		
		System.arraycopy(oldarray, 6, newarray, 0, 6);
		oldarray = null;
		System.out.println(Arrays.toString(newarray));
	}
}
