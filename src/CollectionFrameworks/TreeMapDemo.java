package CollectionFrameworks;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		m.put(100, "zzz");
		m.put(103, "yyy");
		m.put(101, "xxx");
		m.put(104, 106 );
		m.put("FFF", "XXX");
		m.put(null, "XXX"); 
		System.out.println(m);
	}

}
