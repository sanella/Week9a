package day2;

import java.util.Arrays;

public class TestDinamicalArrayString {

	public static void main(String[] args) {
		DinamicalArrayString daos = new DinamicalArrayString(1);
		System.out.println("Velicina niza je " + daos.getMyCount());
		System.out.println("Velicina cijelog niza je " + daos.getMyArray());
		daos.add("Prvi");
		daos.add("Drugi");
		daos.add("treci");
		daos.remov(2);
		System.out.println("Velicina niza je " + daos.getMyCount());
		System.out.println("Velicina cijelog niza je " + daos.getMyArray());
		for (int i = 0; i < daos.getMyCount(); i++) {
			System.out.println(daos.getAt(i) + " ");
		}

		System.out.println(" ");
		System.out.println(Arrays.toString(daos.get()));
		daos.add("cetvrti");
		daos.add("Peti");
	}

}
