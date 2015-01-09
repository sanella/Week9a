package VjezbeDan1;

import java.util.Scanner;

public class RekurzijaBaisc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Ispis brojeva od n do 1 ");
		rekurzija(n);
		
		System.out.println("Ispis sume: ");
		System.out.println(rekurzija2(n));
		
	}

	public static void rekurzija(int n) { // ispisi brojeve od 1 do 10
		if (n != 0) {
			System.out.println(n);
			n--;
			rekurzija(n);
		}

	}

	public static int rekurzija2(int n) { // izracunaj sumu brojeva od n do 0

		if (n > 0) {
			return n + rekurzija2(--n);
		}
		return n;

	}

}
