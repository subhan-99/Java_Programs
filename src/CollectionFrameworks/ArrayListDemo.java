package CollectionFrameworks;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Subhan");
		l.add("10");
		l.add("Habib");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add("2,khan");
		l.add("HUziafa");
		l.add("23.45");
		System.out.println(l);
	}

}
