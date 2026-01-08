package CollectionFrameworks;

import java.util.LinkedList;

public class Collection3 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.addFirst("Coding");
		l1.addLast("Seekho");
		l1.add(1,"College");
		System.out.println(l1.get(1));
		System.out.println(l1.getFirst());
    	System.out.println(l1.getLast());
	}
}
