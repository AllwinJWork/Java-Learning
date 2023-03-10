// Operator Results Task
package exam_task;

public class Runner {

	static int chemistry = 75, biology = 87, physics = 90;
	static int total;

	public static void main(String[] args) {
		displayResults();
		finalgrade();
	}

	static void displayResults() {
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		total = chemistry + biology + physics;
		System.out.println("Total: " + total);

	}

	static double percentage;

	static void finalgrade() {
		percentage = total * 100 / 450.0;
		System.out.println("Percentage: " + percentage);
	}

}
