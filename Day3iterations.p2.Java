package iterations;

public class Runner {

	public static void main(String[] args) {
		printNumbers();

	}

	public static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {

				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}
}
