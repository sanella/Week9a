package VjezbeDan4;

public class PersonLinkList {

	private PersonNode firstPerson;

	public PersonNode getFirstPerson() {
		return firstPerson;
	}

	public void add(Person person) {
		PersonNode next = new PersonNode(person);
		if (firstPerson == null) {
			firstPerson = next;
		} else {

			PersonNode lastPerson = firstPerson;
			while (lastPerson.getNext() != null) {
				lastPerson = lastPerson.getNext();

			}
			lastPerson.setNext(next);
		}
	}

	public  int count() {
		int count = 0;
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			count++;
		}
		return count;
	}

	

	public  void printlist() {
		System.out.println("Name in the list");
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			System.out.println(current.getPerson().getName());
		}

	}

	public  Person[] toArray() {
		int counter = 0;
		Person[] array = new Person[count()];
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			array[counter] = current.getPerson();
			counter++;
		}
		return array;

	}
	
}
