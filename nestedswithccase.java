package basiclabbook;

public class nestedswithccase {
	public static void main(String[] args) {
		int tech= 2;
		int course = 2;
		
		switch (tech) {
		case 1:
			System.out.println("python");
			break;
		case 2:
			System.out.println("c++");
			break;
			
		case 3:
			switch (course) {
			case 1:
				System.out.println("j2ee");
			case 2:
				System.out.println("advance in java");
			}
		
		}
	}
}
