package CollectionFrameworks;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {
	
	public static void main(String args[]) {
		String[] s = {"A", "Z", "B"};
		List l = Arrays.asList(s);
		System.out.println(l); //[A, Z, B]
		s[0] = "K";
		System.out.println(l); //[K, Z, B]
		l.set(1, "L");
		for (String s1 : s )
		System.out.println(s1); //K L B
		l.add("Durga"); //RE: java.lang.UnsupportedOperationException
		l.remove(2); //RE: java.lang.UnsupportedOperationException
		l.set(1, new Integer[10]); //RE: java.lang.ArrayStoreException:[Ljava.lang.Integer;
		}
		}


