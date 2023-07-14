package basiclabbook;

public class swithcase {
	public static void main(String[] args) {
		int tech = 2;
		
		switch (tech) {
		case 1:
		{
			System.out.println("java");
			break;
		}
		case 2:
		{
			System.out.println("c++");
			break;
		}
		default:{
			System.out.println("not listed");
		}
		}
	}
}
