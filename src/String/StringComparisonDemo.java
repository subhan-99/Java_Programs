package String;

public class StringComparisonDemo {
	
	 public static void main(String[] args) {

	        String s1 = "You cannot change me";
	        String s2 = "You cannot change me";

	        System.out.println(s1 == s2);   // true (same SCP object)

	        String s3 = new String("You cannot change me");
	        System.out.println(s1 == s3);   // false (heap vs SCP)

	        String s4 = "You cannot change me";
	        System.out.println(s3 == s4);   // false

	        String s5 = "You cannot" + " change me";
	        System.out.println(s4 == s5);   // true (compile-time concat, SCP)

	        String s6 = "You cannot";
	        String s7 = s6 + " change me";
	        System.out.println(s4 == s7);   // false (runtime concat → heap)

	        final String s8 = "You cannot";
	        String s9 = s8 + " change me";
	        System.out.println(s4 == s9);   // true (final → compile-time)
	    }
	}


