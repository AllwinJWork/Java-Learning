package learning;

public class Runner {

	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			System.out.println("A");
			System.out.println(i);
		}

		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println("-");

			} else {
				System.out.println("*");
			}
		}
		
	
	}

}
