package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {
	
	
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println(al); //[15, 0, 20, 10, 5]
		Collections.sort(al);
		System.out.println(al); //[0, 5, 10, 15, 20]
		}
		}
