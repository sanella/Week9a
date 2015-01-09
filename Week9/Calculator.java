import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		int sum = 0;
		String znak = null;
		int num = 0;
		
		do {
			
			num = sc.nextInt();
			znak = sc.next();
			
		} while (!znak.equals("="));

		if(znak.equals("+"))
			sum += num;
		else sum -= num;

	}
}
