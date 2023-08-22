package vergleichen;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String s1 = "Hallo";
		String s2 = "Hallo";
		s1 += "Muenchen";
		s2 += "Muenchen";

		System.out.println("Stringvergleich: " + s1.equals(s2)); // Ergibt true
		System.out.println("Stringvergleich: " + (s1 == s2)); // Ergibt false

		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println("Zahlenvergleich: " + (i1 == i2)); // Liefert bis 127 true

		Student st1 = new Student(4711, "Franz", "Biberkopf", 1);
		Student st2 = new Student(3984, "Susi", "Maier", 3);
		Student st3 = new Student(3859, "Gerd", "Müller", 4);
		Student st4 = new Student(1234, "Marion", "Schmidt", 5);
		Student st5 = new Student(8429, "Sabine", "Suii", 7);
		Student st6 = new Student(7234, "Christian", "Gabler", 6);
		Student st7 = new Student(6239, "Berhard", "Michaelis", 2);

		System.out.println("Studentenvergleich mit ==: " + (st1 == st2));
		System.out.println("Studentenvergleich mit .equals: " + (st1.equals(st2)));

		Student[] studenten = {st1, st2, st3, st4, st5, st6, st7};
//		System.out.println(Arrays.toString(studenten));

		Student suche = new Student(8429, null, null, 0);

		for (Student s : studenten) {
			if (suche.equals(s)) {
				System.out.println(s);
				break;
			}
		}
	}

}
