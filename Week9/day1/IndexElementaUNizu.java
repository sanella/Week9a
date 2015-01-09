package day1;

import java.util.Arrays;
import java.util.Scanner;

public class IndexElementaUNizu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		System.out.println("Input a number");
		int myNumber = sc.nextInt();
		int index = Arrays.asList(array).indexOf(myNumber);
		if(index == -1){
			System.out.println("Borj se ne nalazi u nizu");
		}else {
			System.out.println("Broj se nalazi na inexu " + index);
		}
	}
	
	
	
	public static int search(int[] array1, int el){
			for (int i = 0; i<array1.length; i++){
				if(array1[i] == el) { return i;}
				
			}
			return -1;
		}
		
		

	}


