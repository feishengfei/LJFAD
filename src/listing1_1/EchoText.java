package listing1_1;

import java.io.IOException;

public class EchoText {
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter some text and press Enter");
		int ch;
		while((ch = System.in.read()) != 13)
			System.out.print((char)ch);
		System.out.println();
	}
}
