package vjezbeDan5a;

import com.sun.corba.se.impl.orbutil.graph.Node;

public class LinkendList<T> {

	private Node head;
	private int size;
	
	//KONSTRUKOR
	public LinkendList(){
		head = null;
		size = 0;
	}
	
	public void add(T value){
		Node newNode = new Node(value);
		if(head == null){
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;	
		}
		current.next = newNode;
		size++;
	}
	
	public void removeAt(int index){
		if (index < 0 || index >= size) {
			// vece ili jednako jer size nije isto sto i index
			throw new IndexOutOfBoundsException("Index nije u fazonu !!!");
		}
		if (index == 0) {
			head = head.next;
			size--;
			return;
		}
		int counter = 1;
		Node current = head.next;
		Node previous = head;
		
		while (counter != index) {
			current = current.next;
			previous = previous.next;
			counter++;
		}

		previous.next = current.next;
		// da izbrise vecu Noda koja je postojala
		current.next = null;
		

	}

	public void add(int index, T value){
		Node newValue = new Node(value);
		if (index < 0 || index > size) {
			// vece ili jednako jer size nije isto sto i index
			throw new IndexOutOfBoundsException("Index nije u fazonu !!!");
		}
		
		if (index == 0) {
		newValue.next = head;
			head = newValue;
			size--;
			return;
		}
		if(index == size){
			add(value);
			return;
		}
		
		int counter = 1;
		Node previous = head;
		
		while (counter != index) {
			previous = previous.next;
			counter++;
		}
//ubacila novi element
		newValue.next = previous.next;
		previous.next = newValue;
		size++;
		

	}

	
	public String toString() {
			String  str = "";
			Node current = head;
			str += "[";
			while(current != null){
				
				str += current.value;
				current = current.next;
				str+=", ";
						
			}
			str += "]"; 
			return str;
			
		}
	//PRIVATNA CLASSA
	private class Node<T>{
		public T value; //vrijednost koju cuva
		public Node next; //pokazivac
	 
		//KONSTRUKTOR
		public Node(T value) {
			this.value = value;
			next = null;
		}
		//KRAJ KONSTRUKTORA

		
		
		
		
	}
	
}
