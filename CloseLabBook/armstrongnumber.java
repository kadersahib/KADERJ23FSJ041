package closelabbook;

public class armstrongnumber {
	public static void main(String[] args) {
		int i=1,a,arm,temp,n;
		System.out.println("find the armstrong number in 1 to 1000");
		while(i<1000) {
			n=i;
			arm=0;
			while(n>0) {
				a=n%10;
				arm=arm+(a*a*a);
				n=n/10;
			}
			if(arm==i)
				System.out.println(i);
			i++;
		}
	}
}
