package VjezbeDan3;

import java.util.prefs.NodeChangeEvent;


public class LinkedlistTest {
public static void main(String[] args) {
	LinkedListInt test = new LinkedListInt();
	System.out.println("poslije brisanja: ");
	test.toArray();
	LinkedListInt test2 = new LinkedListInt();
	test2.add(10);
	test2.add(11);
	test2.add(44);
	test2.add(888);
	test.add(test2);
	test.printlist();
	
}
}
