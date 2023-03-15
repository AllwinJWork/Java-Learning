package constructions;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("AJ", 24, "Trainee SS");
		System.out.println(p1.name + " Is my name");
		Person p2 = new Person("LJ", 24, "eader");

		System.out.println(p2.name + " is my " + p2.occupation);
	}

}
