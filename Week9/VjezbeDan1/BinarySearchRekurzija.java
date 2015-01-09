package VjezbeDan1;

import java.util.Scanner;

public class BinarySearchRekurzija {

	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 }; // zadati niz
		Scanner sc = new Scanner(System.in); // unesi broj za koji zelis index
												// da ispisemo
		System.out.println("Unesi broj: ");
		int myNumber = sc.nextInt();
		
		int binary = binaryRekurzija(array, myNumber, 0, array.length);
		System.out.println(binary);
	}
	
	
	public static int binaryRekurzija(int[] _array, int _myNumber, int _start, int _end ){
		if(_start >= _end)
			return -1;
		
		int middle = (_start + _end) / 2; 
		if (_array[middle] == _myNumber) { 
			return middle;

		} else if (_array[middle] < _myNumber) { 

			return binaryRekurzija(_array, _myNumber, middle+1, _end);
		} else if (_array[middle] > _myNumber) {

			return binaryRekurzija(_array, _myNumber, _start, middle);
		
		}
	
		
		
		return binaryRekurzija(_array, _myNumber, _start, _end);
		
	}
	
}
