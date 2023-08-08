package closelabbook;
import java.util.Scanner;
public class primenumbers {
	public static void main(String[] args) {
		int i;
		int count;
		
		System.out.println("Enter the n values");
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		System.out.println("Prime numbers between to 1 to"+n+"are");
		
		for (int j=0;j<=n;j++)
		{
			count =0;
		for (i=1;i<=j;i++)
		{
			if(j%i==0) 
			{
				count++;
			}
		}
		if(count==2)
			System.out.print(j+"");
		
		}
	}
}
