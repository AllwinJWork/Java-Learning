package answers;

public class Runner {
	public static void main(String[] args) {
		System.out.println("helloworld");
		int i = sum(26, 28);
		System.out.println("I: " + i);
		System.out.println(sum(13, 2));
		System.out.println(multiply(14, 2));
		System.out.println(divide(15, 2));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		return a / b;
	}
}

