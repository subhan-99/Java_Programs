package ExceptionHandling;

import java.io.IOException;

public class ExceptionH4 {
	public static void main(String[] args) {
		System.out.println("A");
		try {
			throw new IOException("printer not found");
			
		}
		catch(IOException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
