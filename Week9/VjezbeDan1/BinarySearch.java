package VjezbeDan1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 }; // zadati niz
		Scanner sc = new Scanner(System.in); //unesi broj za koji zelis index da ispisemo
		System.out.println("Unesi broj: ");
		int myNumber = sc.nextInt();

		int pozicija = binarySerachLoop(array, myNumber); // ispis
		System.out.println(pozicija);

	}

	public static int binarySerachLoop(int[] _array, int _myNumber) {

		int start = 0; // prvi index niz
 		int end = _array.length - 1; // zadnji element niza

		while (end >= start) { // sve dok je start manji ili jednak endu radi ovo:
			int middle = (start + end) / 2; // sredina niza je middle 
			if (_array[middle] == _myNumber) { // ako je jednak broj odmah ga ispis
				return middle;

			} else if (_array[middle] > _myNumber) { // ako je middle broj veci od mog broja

				end = middle - 1; // onda je krajnji broj middle - 1
			} else if (_array[middle] < _myNumber) {

				start = middle + 1;  
			}
		}

		return -1;

	}
}
