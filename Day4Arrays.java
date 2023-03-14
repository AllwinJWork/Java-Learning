package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreatingArrays {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Allwin");
		names.add("Johnson");
		names.add("Jovi");
		names.add("Kwong");
		names.add("Olivia");
		names.add("Emelia");
		names.add("Bray");

		System.out.println(names);
		System.out.println(names.get(0));
		names.set(0, "Win");
		System.out.println(names.get(0));
		names.remove(1);
		System.out.println(names.size());
		Collections.sort(names);
		System.out.println(names);
		names.add(3, "Jordan");
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		names.removeAll(List.of("Bray", "Kwong", "Kelly"));
		System.out.println(names);

	}

}
