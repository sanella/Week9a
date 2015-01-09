package vjezbeDan5a;

import java.util.Arrays;

public class ArrayList<T> {

	private T[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;
	
	//KONSTRUKTOR
	public ArrayList(){
		size = 0;
		array = (T[])(new Object[DEFAULT_SIZE]);
		//array = new int[DEFAULT_SIZE];
	}
	
	
	public int getSize() {
		return size;
	}
	

	//METODA ZA DODAVANJE ELEMENATA
	public void add(T value){
		if(size == array.length)
			resize();
		array[size] = value;
		size++;
	}
	
	public void add(int index, T value){
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index nije u fazonu !!!");
		}
		T[] temp = (T[])(new Object[DEFAULT_SIZE+1]);
		for(int i = 0;i<array.length; i++){
			temp[i] = array[i];	
			if(i == index)
			array[index] = value;
			temp[i+1] = array[i];
		}
		this.array = temp;		
		
		size++;
	}
	
	//METODA ZA PROSIRIVANJE NIZA
	private void resize() {
		T[] temp = (T[])(new Object[DEFAULT_SIZE*2]);
		for(int i= 0; i<array.length; i++ ){
			temp[i] = array[i];
			
		}
		this.array = temp;	
	}

	public void removeAt(int index) {
		if (index < 0 || index >= size) 
			throw new IndexOutOfBoundsException("Index nije u fazonu !!!");
		for (int i = index; i < size -1; i++) {
			array[i] = array[i + 1];
			

		}
		size--;

	}

	public String toString() {
		String str = "[";
		for(int i =0; i <size; i++){
		
			str+=array[i];
			str+= ", ";
		}
		str+= "]";
		return str;
	}


	
	


	
	
	
}
