package vjezbeDan2;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 4, 3, 1, 2, 5 };

		insertionSort(array);
        System.out.println("InsertionSort: ");
        printArray(array);
        
        
        System.out.println("SelectionSort: ");
        selectionSort(array);
        printArray(array);
	}

	public static void printArray(int[] _array) {
        System.out.println(Arrays.toString(_array));
    }
	
	
	 private static void insertionSort(int[] _array) {
	        for (int i = 1; i < _array.length; i++) {
	            int valueToSort = _array[i];
	            int j = i;
	            while (j > 0 && _array[j - 1] > valueToSort) {
	                _array[j] = _array[j - 1];
	                j--;
	            }
	            _array[j] = valueToSort;
	        }
	    }
	
	
	 private static void selectionSort(int[] _array){
		 int minPos = 0;
		 int i = 0;
		 int j = 0;
		 for(i =0; i< _array.length-1; i++){
			 minPos = i;
			 for( j = i+1; j<_array.length; j++){
				 if(_array[minPos] > _array[j]){
					 minPos = j;
					  int smallerNumber = _array[j];
					  _array[minPos] = _array[i];
					  _array[i] = smallerNumber;
			
				 }
			 }
		 }
	 }

}