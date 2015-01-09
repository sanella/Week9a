package VjezbeDan5;

public class Test {
	public static void main(String[] args) {
	
	LinkendListInt lli = new LinkendListInt();
	lli.add(1);
	lli.add(2);
	lli.add(3);
	lli.add(4);
	lli.add(0, 100);
	//lli.removeAt(2);

	System.out.println(lli.toString());
}
}
