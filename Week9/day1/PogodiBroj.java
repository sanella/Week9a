package day1;

import java.util.Scanner;

public class PogodiBroj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int number = (int) (1 + Math.random() * 100);
		int i = 0;

		System.out.println("Trazeni broj" + number);

		while (i != number) {

			System.out.println("Input  number");
			i = sc.nextInt();
			if (i < number)
				System.out.println("Input a bigger number");

			if (i > number)
				System.out.println("Input a smaller number");
			count++;
		}
		System.out.println("Pogodili ste u " + count + " pokusaja");
		if (i == number)
			System.out.println("Congratulations");

	}

}
