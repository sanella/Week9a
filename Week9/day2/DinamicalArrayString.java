package day2;

import java.util.Arrays;

public class DinamicalArrayString {

	

	private static final int INITIAL_NUMBER_OF_ELEMENTS = 4;
	private String[] myArray;
	private int myCount;

	public DinamicalArrayString() {
		this(INITIAL_NUMBER_OF_ELEMENTS); // poziva drugi konstruktor i saljem
											// mu constantu

	}

	public DinamicalArrayString(int initialNoOdElements) {
		super();
		myArray = new String[initialNoOdElements];
		myCount = 0;
	}

	public int getMyCount() {
		return myCount;
	}
	
	public int getMyArray() {
		return myArray.length;
	}
	
	public void add(String str) {
		if (myCount == myArray.length) { // drugi nacin prosirivanja niza
			myArray = Arrays.copyOf(myArray, myArray.length * 2);
		}
		myArray[myCount] = str;
		myCount++;
		if (myCount == myArray.length) {
			myArray = Arrays.copyOf(myArray, myArray.length * 2);
		}
	}
	
	public void set(int offset, String str){
		if(offset < 0 || offset >= myCount)
			throw new IndexOutOfBoundsException("Your offset" + offset + "does not belong to [0; " + (myCount-1) + "].");
		myArray[offset] = str;
		
	}

	public String getAt(int offset){
		if(offset < 0 || offset >= myCount)
			throw new IndexOutOfBoundsException("Your offset" + offset + "does not belong to [0; " + (myCount-1) + "].");
		return myArray[offset] ;
		
	}
	
	public String[] get() { // kopira elemente u novi niz, ukoliko je u prvom bilo praznih elemenata ovdje ih nece biti
		return Arrays.copyOf(myArray, myCount);
	}
	
	public void remov(int offset){
		if(offset < 0 || offset >= myCount)
			throw new IndexOutOfBoundsException("Your offset" + offset + "does not belong to [0; " + (myCount-1) + "].");
		for(int i = offset; i<myCount-1; i++){
			myArray[i] = myArray[i+1];	
		}
		myCount--;
		if(myCount < myArray.length / 3) {
			myArray = Arrays.copyOf(myArray,  myArray.length / 2);
		}
	}
	
	
}
