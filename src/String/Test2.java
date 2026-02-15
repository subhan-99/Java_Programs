package String;


// StringBuffer

public class Test2 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("khan");
		StringBuffer sb2 = new StringBuffer("software");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}

}
