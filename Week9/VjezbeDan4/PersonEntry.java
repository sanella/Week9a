package VjezbeDan4;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class PersonEntry {

	public static void main(String[] args) {
		String name;
		int count = 0;
		PersonLinkList list = new PersonLinkList();
		do {
			name = TextIO.getlnString();
			if (name.equals("kraj")){
				break;
			}
			Person person = new Person(name);
			list.add(person);
		} while (true);

		list.printlist(); // pozivam metodu ispis
		System.out.println(list.count()); // pozivam metodu count
	}

	
	
}
