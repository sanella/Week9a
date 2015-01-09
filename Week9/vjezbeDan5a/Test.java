package vjezbeDan5a;


public class Test {
	public static void main(String[] args) {
		LinkendList<Integer> ml = new LinkendList<Integer>();
		ml.add(3);
		ml.add(2);
		ml.add(1);
		
		System.out.println(ml.toString());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(7);
		al.add(8);
		al.add(9);
		System.out.println(al.toString());
	}

}
