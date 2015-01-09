package VjezbeDan3;

public class LinkedListInt {

	private Node head;
	private int size;

	public LinkedListInt() {
		this.head = null;
		this.size = 0;

	}

	public void add(LinkedListInt other) {

	//	Node newNode = new Node(size);
		if (head == null) {
		head = other.head;
			size++;
			return;
		}
		Node current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = other.head;
						
		size++;
	}

	
	public int[] toArray() {
		int[] niz = new int[size];
		Node current = head;
		for (int i = 0; i < size; i++) {
			niz[i] = current.value;
			current = current.next;
		}
		return niz;
	}

	public void add(int value, int index) {

		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Necu....NEMERE !!!");
		}

		Node newNode = new Node(value);
		if (index == 0) {

			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		if (index == size) {
			add(value);
			return;
		}
		Node current = head.next;
		int counter = 1;

		while (counter < index) {
			current = current.next;
			counter++;

		}

		newNode.next = current.next;
		current.next = newNode;
		size++;
	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}

	public void printlist() {
		Node current = head;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}

	}

	public void removeAt(int index) {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Necu....NEMERE !!!");
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
		current.next = null;

	}

	private class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

	}

}
